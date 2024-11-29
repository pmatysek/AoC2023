import java.io.File

typealias ConditionFun = (Map<String, Long>) -> String?

val file = File("day19.MD").printWriter()
var mermaidIndex = 0UL
fun nextMermaidIndex(): ULong {
    mermaidIndex += 1uL
    return mermaidIndex
}
fun main() {
    val input = "day19".getInputLines().chunkedByEmptyLine()
    val workflows = input.first().map {
        val splitted = it.split('{')
        val name = splitted.first()
        val conditions = splitted.second().dropLast(1).split(',').map mapConditions@{ conditionString ->
            if (conditionString.contains('>') || conditionString.contains('<')) {
                val condition = conditionString[1]
                val (paramToCheck, valueToCheck, valueToReturn) = conditionString.split(condition, ':')
                val conditionFun: Pair<ConditionFun, LongRange> = when (condition) {
                    '>' -> { { params: Map<String, Long> ->
                        if (params[paramToCheck]!! > valueToCheck.toLong()) {
                            valueToReturn
                        } else {
                            null
                        }
                    } to valueToCheck.toLong() + 1..4000L }
                    '<' -> { { params: Map<String, Long> ->
                        if (params[paramToCheck]!! < valueToCheck.toLong()) {
                            valueToReturn
                        } else {
                            null
                        }
                    } to 1L..<valueToCheck.toLong() }
                    else -> throw IllegalArgumentException()
                }
                return@mapConditions Condition(
                    conditionFun = conditionFun.first,
                    valueToReturn = valueToReturn,
                    paramToCheck = paramToCheck,
                    range = conditionFun.second,
                )
            } else {
                return@mapConditions Condition(
                    conditionFun = { params -> conditionString },
                    valueToReturn = conditionString,
                )
            }
        }
        Workflow(name, conditions)
    }.associateBy { it.name }

    val ratings = input.second().map {
        it.drop(1).dropLast(1).split(',').associate {
            val (param, value) = it.split('=')
            param to value.toLong()
        }
    }
    val acceptedRatings = ratings.filter { it.isAccepted(workflows) }
    println(acceptedRatings.sumOf { it.values.sum() })

    file.println("```mermaid")
    file.println("flowchart TD")
    println(
        workflows.numberOfPossibilities(
            mutableMapOf(
                "x" to 1L..4000L,
                "m" to 1L..4000L,
                "a" to 1L..4000L,
                "s" to 1L..4000L,
            ),
            "in",
        ),
    )
    file.close()
}

val FOUR_K_POW_3 = 4000UL * 4000UL * 4000UL
private val workflowCache: MutableMap<Pair<Map<String, LongRange>, String>, ULong> = mutableMapOf()
fun Map<String, Workflow>.numberOfPossibilities(ranges: MutableMap<String, LongRange>, workflowName: String): ULong {
    return workflowCache.getOrPut(ranges to workflowName) {
        val currentToPrint = "$workflowName"
        if(ranges.values.any { it.isEmpty() }) {
            return@getOrPut 0uL
        }
        when (workflowName) {
            "A" -> {
                return@getOrPut ranges.values.map { it.count() }.fold(1uL) { acc, i -> acc * i.toULong() }.toULong()
            }
            "R" -> {
               return@getOrPut 0uL
            }
            else -> {
                val workflow = this[workflowName]!!
                var value = 0UL
                var newRanges = ranges.toMutableMap()
                workflow.conditions.forEach { condition ->
                    if (condition.range != null) {
                        val intersected = condition.range intersect newRanges[condition.paramToCheck!!]!!
                        val mapToGo = (newRanges + (condition.paramToCheck to intersected)).toMutableMap()
                        value += numberOfPossibilities(
                            mapToGo,
                            condition.valueToReturn,
                        )
                        val mermaidIdx = nextMermaidIndex()
                        file.println("$currentToPrint --> $mermaidIdx[${mapToGo.toMermaid()}]")
                        file.println("$mermaidIdx --> ${condition.valueToReturn}")
                        newRanges = (newRanges + (condition.paramToCheck to (condition.range.not() intersect newRanges[condition.paramToCheck!!]!!))).toMutableMap()
                    } else {
                        val mermaidIdx = nextMermaidIndex()
                        file.println("$currentToPrint --> $mermaidIdx[${newRanges.toMermaid()}]")
                        file.println("$mermaidIdx --> ${condition.valueToReturn}")
                        value += numberOfPossibilities(newRanges, condition.valueToReturn)
                    }
                }
                return@getOrPut value
            }
        }
    }
}

fun Map<String, LongRange>.toMermaid() =
    this.map { "${it.key} : ${it.value}" }.joinToString("<br>")

val LongRange.min
    get() = minOf(start, endInclusive)

val LongRange.max
    get() = maxOf(start, endInclusive)

val LongRange.size
    get() = max - min

operator fun LongRange.not() =
    if (first == 1L) {
        last + 1..4000L
    } else {
        1L..<first
    }

fun emptyLongRange() = (0L..<0L)
infix fun LongRange.intersect(other: LongRange) =
    if (min <= other.max && other.min <= max) {
        maxOf(min, other.min).rangeTo(minOf(max, other.max))
    } else {
        emptyLongRange()
    }

private fun Map<String, Long>.isAccepted(workflows: Map<String, Workflow>): Boolean {
    var workflow = workflows["in"]!!
    while (true) {
        val value = workflow.conditions.map { it.conditionFun(this) }.filterNotNull().first()
        when (value) {
            "A" -> return true
            "R" -> return false
            else -> workflow = workflows[value]!!
        }
    }
}

data class Workflow(
    val name: String,
    val conditions: List<Condition>,
)

data class Condition(
    val conditionFun: ConditionFun,
    val paramToCheck: String? = null,
    val range: LongRange? = null,
    val valueToReturn: String,
)
