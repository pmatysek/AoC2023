import Operation.ADD
import Operation.REMOVE

fun main() {
    val input = "day15".getInputLines().joinToString("").replace("\n", "").split(",")
    val hashes = input.map { it.hash() }
    println(hashes.sum())

    val labels = input.map {
        val operator = it.first { !it.isLetter() }
        val splitted = it.split(operator)
        when (operator) {
            '=' -> Input(
                label = splitted.first(),
                operation = ADD,
                value = splitted.second().toInt(),
                hash = splitted.first().hash(),
            )

            '-' -> Input(
                label = splitted.first(),
                operation = REMOVE,
                value = null,
                hash = splitted.first().hash(),
            )

            else -> throw IllegalArgumentException()
        }
    }
    val map: MutableMap<Int, MutableList<Input>> = mutableMapOf()
    labels.forEach { curInput ->
        when (curInput.operation) {
            ADD -> {
                map.getOrPut(curInput.hash) { mutableListOf() }
                val found = map[curInput.hash]!!.indexOfFirst { it.label == curInput.label }
                if (found == -1) {
                    map[curInput.hash]!!.add(curInput)
                } else {
                    map[curInput.hash]!![found] = curInput
                }
            }

            REMOVE -> {
                map.getOrPut(curInput.hash) { mutableListOf() }
                map[curInput.hash]!!.removeIf { it.label == curInput.label }
            }
        }
    }
    val focPowers = map.map { entry ->
        entry.value.mapIndexed { index, input ->
            (entry.key + 1) * (index + 1) * input.value!!
        }
    }.flatten()
    println(focPowers.sum())
}

data class Input(
    val label: String,
    val operation: Operation,
    val value: Int?,
    val hash: Int,
)

enum class Operation { ADD, REMOVE }

private fun String.hash() = (
    listOf(0) + map {
        it.code
    }
    ).reduce { acc, i ->
    val sum = acc + i
    (sum * 17) % 256
}
