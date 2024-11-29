import LavaDir.D
import LavaDir.L
import LavaDir.R
import LavaDir.U
import kotlin.math.sqrt

fun main() {
    val input = "day18".getInputLines()
    println(part1(input))
    println(part2(input))
}

private fun part1(input: List<String>): Any {
    val instructions = input.map {
        val splitted = it.split(" ")
        val dir = LavaDir.valueOf(splitted.first())
        val length = splitted.second().toInt()
        dir to length
    }
    return calculateArea(instructions)
}

@OptIn(ExperimentalStdlibApi::class)
private fun part2(input: List<String>): Any {
    val instructions = input.map {
        val splitted = it.split(" ")
        val hex = splitted[2].replace("(#", "").replace(")", "")
        val dir = when (hex.last()) {
            '0' -> R
            '1' -> D
            '2' -> L
            '3' -> U
            else -> throw IllegalArgumentException()
        }
        val num = hex.dropLast(1).hexToInt()
        dir to num
    }
    return calculateArea(instructions)
}

private fun calculateArea(instructions: List<Pair<LavaDir, Int>>): Double {
    var currPoint = Point3(0, 0, 0)
    val points: MutableList<Point3> = mutableListOf(currPoint)
    instructions.forEach {
        val dir = it.first
        val length = it.second
        currPoint += dir.vector * length
        points.add(currPoint)
    }
    val obw = points.zipWithNext()
        .sumOf { (a, b) -> sqrt(((b.x - a.x) * (b.x - a.x) + (b.y - a.y) * (b.y - a.y)).toDouble()) }
    return (points.zipWithNext().sumOf { (a, b) -> (b.x - a.x) * (b.y + a.y) } / 2L) + obw / 2L + 1L
}

enum class LavaDir(
    val vector: Pair<Long, Long>,
) {
    U(
        vector = -1L to 0L,
    ),
    D(
        vector = 1L to 0L,
    ),
    L(
        vector = 0L to -1L,
    ),
    R(
        vector = 0L to 1L,
    ),
}

operator fun Point3.plus(vector: Pair<Long, Long>) = this.moveByVector(vector)
operator fun Pair<Long, Long>.times(n: Long) = first * n to second * n
operator fun Pair<Long, Long>.times(n: Int) = first * n to second * n
