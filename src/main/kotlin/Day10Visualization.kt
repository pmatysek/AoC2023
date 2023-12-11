fun printMatrix(
    matrix: List<List<Char>>,
    cycles: List<List<Pair<Int, Int>>>,
) {
    matrix.indices.forEach { i ->
        (0..<matrix.first().size).forEach { j ->
            if (cycles.any { it.contains(i to j) } || matrix[i][j] == 'S') {
                print(matrix[i][j].prettied().colored())
            } else {
                print(' ')
            }
        }
        println()
    }
}

private fun Char.prettied() =
    when (this) {
        'F' -> '┏'
        '7' -> '┓'
        'J' -> '┛'
        'L' -> '┗'
        '|' -> '┃'
        '-' -> '━'
        else -> this
    }
private const val RED = "\u001b[31m"
private const val RESET_COLOR = "\u001b[0m"
private fun Char.colored() = "$RED$this$RESET_COLOR"
