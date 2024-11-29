import java.lang.IllegalStateException

fun main() {
    val input = "day12".getInputLines()
    println(part1(input))
    println(part2(input))
}

val cache: MutableMap<Row.FunInput, ULong> = mutableMapOf()
data class Row(
    val springs: List<Char>,
    val criteria: List<Int>,
) {
    data class FunInput(
        val symbols: String,
        val criteria: List<Int>,
        val groupLength: Int,
    )

    fun numberOfCorrectCombinations() = numberOfCorrectCombinations(
        springs.joinToString(""),
        criteria,
    )

    private fun numberOfCorrectCombinations(
        symbols: String,
        criteria: List<Int>,
        groupLength: Int = 0,
    ): ULong {
        val current = symbols.first()
        if (current == '?') {
            return cache.getOrPut(FunInput(symbols, criteria, groupLength)) {
                (
                    numberOfCorrectCombinations(
                        symbols.replaceFirst('?', '.'),
                        criteria,
                        groupLength,
                    ) + numberOfCorrectCombinations(symbols.replaceFirst('?', '#'), criteria, groupLength)
                    )
            }
        }
        return cache.getOrPut(
            FunInput(symbols, criteria, groupLength),
        ) {
            when (current) {
                '.' -> {
                    if (criteria.isEmpty()) {
                        if (symbols.isLastSymbol()) {
                            1uL
                        } else {
                            numberOfCorrectCombinations(symbols.drop(1), criteria)
                        }
                    } else {
                        if (symbols.isLastSymbol()) {
                            1uL.takeIf { groupLength == criteria.first() && criteria.size == 1 } ?: 0uL
                        } else {
                            if (groupLength == criteria.first()) {
                                numberOfCorrectCombinations(symbols.drop(1), criteria.drop(1))
                            } else {
                                if (groupLength > 0) {
                                    0uL
                                } else {
                                    numberOfCorrectCombinations(symbols.drop(1), criteria)
                                }
                            }
                        }
                    }
                }

                '#' -> {
                    if (criteria.isEmpty()) {
                        0uL
                    } else {
                        if (symbols.isLastSymbol()) {
                            1uL.takeIf { groupLength + 1 == criteria.first() && criteria.size == 1 } ?: 0uL
                        } else {
                            if (groupLength == criteria.first()) {
                                0uL
                            } else {
                                numberOfCorrectCombinations(symbols.drop(1), criteria, groupLength + 1)
                            }
                        }
                    }
                }

                else -> throw IllegalStateException()
            }
        }
    }

    private fun String.isLastSymbol() = length == 1
}

private fun part1(input: List<String>): Any {
    val rows = input.map {
        val splitted = it.split(" ")
        Row(
            springs = splitted.first().toList(),
            criteria = splitted.second().split(",").map { it.toInt() },
        )
    }
    val arragments = rows.map { it.numberOfCorrectCombinations() }
    return arragments.sum()
}

private fun part2(input: List<String>): Any {
    val rows = input.map {
        val splitted = it.split(" ")
        Row(
            springs = List(5) { splitted.first().toList() + '?' }.flatten().dropLast(1),
            criteria = List(5) { splitted.second().split(",").map { it.toInt() } }.flatten(),
        )
    }
    val arragments = rows.map { it.numberOfCorrectCombinations() }
    return arragments.sum()
}
