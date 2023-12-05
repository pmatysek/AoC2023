fun main() {
    val input = "day3".getInputLines()
    println(part1(input))
    println(part2(input))
}

private fun part1(input: List<String>): Any {
    val matrix = input.map { it.toCharArray().toList() }
    val filtered = matrix.mapIndexed { i, row ->
        row.filterIndexed { j, symbol ->
            !symbol.isDigit() || (
                (
                    isNeighborOfASymbol(row, j, matrix, i) || (
                        row.getOrNull(j - 1)
                            ?.isDigit() ?: false && isNeighborOfASymbol(row, j - 1, matrix, i)
                        ) || (
                        row.getOrNull(j + 1)
                            ?.isDigit() ?: false && isNeighborOfASymbol(row, j + 1, matrix, i)
                        ) || (
                        row.getOrNull(j - 1)
                            ?.isDigit() ?: false && row.getOrNull(j - 2)
                            ?.isDigit() ?: false && isNeighborOfASymbol(row, j - 2, matrix, i)
                        ) || (
                        row.getOrNull(j + 1)
                            ?.isDigit() ?: false && row.getOrNull(j + 2)
                            ?.isDigit() ?: false && isNeighborOfASymbol(row, j + 2, matrix, i)
                        )
                    )
                )
        }
    }
    val filtered2 = filtered.map {
        it.joinToString("").split("(\\D)".toRegex()).filter { it.isNotBlank() && it.any { it.isDigit() } }
            .map { it.filter { it.isDigit() } }
    }.flatten()
    return filtered2.sumOf { it.toInt() }
}

private fun isNeighborOfASymbol(
    row: List<Char>,
    j: Int,
    matrix: List<List<Char>>,
    i: Int,
) =
    (
        row.getOrNull(j - 1).isSymbol() ||
            row.getOrNull(j + 1).isSymbol() ||
            matrix.getOrNull(i - 1)?.get(j).isSymbol() ||
            matrix.getOrNull(i + 1)?.get(j).isSymbol() ||
            matrix.getOrNull(i - 1)?.getOrNull(j - 1).isSymbol() ||
            matrix.getOrNull(i - 1)?.getOrNull(j + 1).isSymbol() ||
            matrix.getOrNull(i + 1)?.getOrNull(j - 1).isSymbol() ||
            matrix.getOrNull(i + 1)?.getOrNull(j + 1).isSymbol()
        )

private fun Char?.isSymbol() = this?.let {
    it != '.' && !it.isDigit()
} ?: false

private fun part2(input: List<String>): Any {
    val matrix = input.map { it.toCharArray().toList() }
    val filtered = matrix.mapIndexed { i, row ->
        row.mapIndexed() { j, c ->
            if (c.isSymbol()) {
                matrix.getAdjacentNumbers(i, j)
            } else {
                null
            }
        }
    }.flatten().filterNotNull()
    return filtered.filter { it.size == 2 }.sumOf { it.first() * it.second() }
}

val middleNumberRegex = "(..\\.\\d\\...|.\\.\\d\\d\\...|..\\.\\d\\d\\..|.\\.\\d\\d\\d\\..)".toRegex()
val leftNumberRegex = "(.\\.\\d\\.(.*)|\\.\\d\\d(.*)|\\d\\d\\d(.*)|\\.\\d\\d\\d\\.(.*))".toRegex()
val rightNumberRegex = "((.*)\\.\\d\\..|(.*)\\d\\d\\.|(.*)\\d\\d\\d|(.*).\\d\\d\\d\\.)".toRegex()

val regexesWithNumberLocation = listOf(
    middleNumberRegex to (2 to 5),
    leftNumberRegex to (0 to 4),
    rightNumberRegex to (3 to 7),
)

fun List<List<Char>>.getAdjacentNumbers(x: Int, y: Int): List<Int> {
    return regexesWithNumberLocation.map {
        (-1..1).mapIndexed { _, i ->
            this[(x + i).coerceIn(this.indices)]
                .subListCoercedIn(y - 3, y + 4)
                .takeIfMatchesRegex(it.first)
                ?.subListCoercedIn(it.second.first, it.second.second)
                ?.toNumberExcludingNonDigits()
        }
    }.flatten().filterNotNull()
}
