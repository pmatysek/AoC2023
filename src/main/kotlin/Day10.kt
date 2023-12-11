import Direction.DOWN
import Direction.LEFT
import Direction.RIGHT
import Direction.UP
import kotlin.math.abs

fun main() {
    val input = "day10".getInputLines()
    println(part1(input))
}

private fun part1(input: List<String>): Any {
    val matrix = input.map { it.toCharArray().toList() }
    val startingPoint = matrix.findCoordinatesOf('S')
    val graph = Graph<Pair<Int, Int>>()
    matrix.forEachIndexed { i, row ->
        row.forEachIndexed { j, c ->
            val currentPoint = i to j
            movesMap[c]?.forEach { direction ->
                val targetPoint = currentPoint.moveByVector(direction.vector).takeIf { it.isOnMatrix(matrix) }
                if (matrix.canConnect(targetPoint, direction)) {
                    graph.addEdgeIfNotNull(currentPoint, targetPoint)
                }
            }
        }
    }
    val paths = graph.edges[startingPoint]!!.toMutableSet()
    val cycles = paths.map {
        graph.edges[startingPoint]!!.remove(it)
        val path = graph.shortestPath(startingPoint, it)
        graph.edges[startingPoint]!!.add(it)
        path
    }
    printMatrix(matrix, cycles)
    val area = abs(
        (cycles.first() + cycles.first().first()).zipWithNext()
            .sumOf { (a, b) -> (b.first + a.first) * (b.second - a.second) } / 2,
    )
    val farthest = cycles.maxOf { it.size } / 2.0
    println("Area: ${area - farthest + 1}")
    return farthest
}

val movesMap = mapOf(
    '-' to listOf(LEFT, RIGHT),
    '|' to listOf(UP, DOWN),
    'J' to listOf(UP, LEFT),
    'L' to listOf(UP, RIGHT),
    'F' to listOf(DOWN, RIGHT),
    '7' to listOf(DOWN, LEFT),
)
enum class Direction(
    val vector: Pair<Int, Int>,
    val allowedSymbols: List<Char>,
) {
    UP(
        vector = -1 to 0,
        allowedSymbols = listOf('7', '|', 'F', 'S'),
    ),
    DOWN(
        vector = 1 to 0,
        allowedSymbols = listOf('|', 'L', 'J', 'S'),
    ),
    LEFT(
        vector = 0 to -1,
        allowedSymbols = listOf('-', 'F', 'L', 'S'),
    ),
    RIGHT(
        vector = 0 to 1,
        allowedSymbols = listOf('-', '7', 'J', 'S'),
    ),
}

fun List<List<Char>>.canConnect(second: Pair<Int, Int>?, dir: Direction) =
    second?.let {
        val value = this[it.first][it.second]
        value in dir.allowedSymbols
    } ?: false

