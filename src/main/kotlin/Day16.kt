import Direction.DOWN
import Direction.LEFT
import Direction.RIGHT
import Direction.UP

fun main() {
    val input = "day16".getInputLines()
    println(part1(input))
    println(part2(input))
}

var visited: MutableSet<Pair<Pair<Int, Int>, Direction>> = mutableSetOf()
private fun part1(input: List<String>): Any {
    val matrix = input.map { it.toCharArray().toList() }
    matrix.move(0 to 0, RIGHT)
    return visited.map { it.first }.toSet().count()
}

tailrec fun List<List<Char>>.move(point: Pair<Int, Int>, direction: Direction) {
    if (point.first !in this.indices || point.second !in this.first().indices || !visited.add(point to direction)) {
        return
    }

    return when (this[point.first][point.second]) {
        '.' -> move(point.moveByVector(direction.vector), direction)
        '|' -> when (direction) {
            UP, DOWN -> move(point.moveByVector(direction.vector), direction)
            RIGHT, LEFT -> {
                move(point.moveByVector(UP.vector), UP)
                move(point.moveByVector(DOWN.vector), DOWN)
            }
        }
        '-' -> when (direction) {
            RIGHT, LEFT -> move(point.moveByVector(direction.vector), direction)
            UP, DOWN -> {
                move(point.moveByVector(RIGHT.vector), RIGHT)
                move(point.moveByVector(LEFT.vector), LEFT)
            }
        }
        '/' -> when (direction) {
            UP -> move(point.moveByVector(RIGHT.vector), RIGHT)
            DOWN -> move(point.moveByVector(LEFT.vector), LEFT)
            LEFT -> move(point.moveByVector(DOWN.vector), DOWN)
            RIGHT -> move(point.moveByVector(UP.vector), UP)
        }
        '\\' -> when (direction) {
            UP -> move(point.moveByVector(LEFT.vector), LEFT)
            DOWN -> move(point.moveByVector(RIGHT.vector), RIGHT)
            LEFT -> move(point.moveByVector(UP.vector), UP)
            RIGHT -> move(point.moveByVector(DOWN.vector), DOWN)
        }
        else -> throw IllegalArgumentException()
    }
}
private fun part2(input: List<String>): Any {
    val matrix = input.map { it.toCharArray().toList() }
    visited = mutableSetOf()
    val rightEnergized = matrix.indices.mapIndexed { index, _ ->
        visited = mutableSetOf()
        matrix.move(index to 0, RIGHT)
        visited.map { it.first }.toSet().count()
    }
    val leftEnergized = matrix.indices.mapIndexed { index, _ ->
        visited = mutableSetOf()
        matrix.move(index to matrix.indices.last, LEFT)
        visited.map { it.first }.toSet().count()
    }
    val downEnergized = matrix.first().indices.mapIndexed { index, _ ->
        visited = mutableSetOf()
        matrix.move(0 to index, DOWN)
        visited.map { it.first }.toSet().count()
    }
    val upEnergized = matrix.first().indices.mapIndexed { index, _ ->
        visited = mutableSetOf()
        matrix.move(matrix.indices.last to index, UP)
        visited.map { it.first }.toSet().count()
    }
    return (rightEnergized + leftEnergized + downEnergized + upEnergized).max()
}
