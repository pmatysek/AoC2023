
var finishGardens: MutableSet<Pair<Int, Int>> = mutableSetOf()
fun main() {
    val input = "day21".getInputLines()
    val gardenMap = input.map { it.toCharArray().toList() }
    val startingPoint: Pair<Int, Int> = gardenMap.findCoordinatesOf('S')
    println(gardenMap.goThroughMap(startingPoint, 64))
    println(finishGardens.size)
}

private var gardensCache: MutableMap<Pair<Pair<Int, Int>, Int>, Int> = mutableMapOf()
fun List<List<Char>>.goThroughMap(point: Pair<Int, Int>, length: Int): Int {
    return gardensCache.getOrPut(point to length) {
        if (this[point.first][point.second] == '#') {
            return@getOrPut 0
        }
        val newLength = length - 1
        if (newLength == -1) {
            finishGardens.add(point)
            return@getOrPut 1
        }
        return@getOrPut GardenDirection.entries.map { direction ->
            point.moveByVector(direction.vector).takeIf { it.first in this.indices && it.second in this.first().indices  }?.let { pointToGo ->
                goThroughMap(pointToGo, newLength)
            } ?: 0
        }.sum()
    }
}

private var gardensCache2: MutableMap<Pair<Pair<Long, Long>, Long>, Long> = mutableMapOf()
var finishGardens2: MutableSet<Pair<Long, Long>> = mutableSetOf()
tailrec fun List<List<Char>>.goThroughMap2(point: Pair<Long, Long>, stepsToTake: Long): Long {
    val (newPoint, collapsedTimes) = point.collapsedIn(this)
    val totalCollapsed = collapsedTimes.first + collapsedTimes.second + 1
    return gardensCache2.getOrPut(newPoint to stepsToTake) {
        if (this[newPoint] == '#') {
            return@getOrPut 0
        }
        if (stepsToTake == 0L) {
            finishGardens2.add(point)
            return@getOrPut 1
        }
        return@getOrPut GardenDirection.entries.sumOf { direction ->
            goThroughMap2(newPoint.moveByVector(direction.vector), stepsToTake - 1)
        }
    }
}

fun Pair<Long, Long>.collapsedIn(matrix: List<List<Char>>): Pair<Pair<Long, Long>, Pair<Long, Long>> {
    val x = first.mod(matrix.indices.last + 1)
    val xTimes = first / matrix.indices.last
    val y = second.mod(matrix.first().indices.last + 1)
    val yTimes = second / matrix.first().indices.last
    return (x.toLong() to y.toLong()) to (xTimes to yTimes)
}
operator fun List<List<Char>>.get(point: Pair<Long, Long>): Char {
    return this[point.first.toInt()][point.second.toInt()]
}

enum class GardenDirection(
    val vector: Pair<Int, Int>,
) {
    UP(
        vector = -1 to 0,
    ),
    DOWN(
        vector = 1 to 0,
    ),
    LEFT(
        vector = 0 to -1,
    ),
    RIGHT(
        vector = 0 to 1,
    ),
}