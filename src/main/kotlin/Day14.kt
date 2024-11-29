
import kotlin.math.max
import kotlin.math.min

fun main() {
    val input = "day14".getInputLines()
    println(part1(input))
    println(part2(input))
}

private fun part1(input: List<String>): Any {
    val (solidRocks, movingRocks) = parseInput(input)
    val newMovingRocks = movingRocks.moveN(solidRocks)
    return newMovingRocks.sumOf { input.size - it.first }
}

val cacheN: MutableMap<List<Pair<Int, Int>>, List<Pair<Int, Int>>> = mutableMapOf()
val cacheS: MutableMap<List<Pair<Int, Int>>, List<Pair<Int, Int>>> = mutableMapOf()
val cacheW: MutableMap<List<Pair<Int, Int>>, List<Pair<Int, Int>>> = mutableMapOf()
val cacheE: MutableMap<List<Pair<Int, Int>>, List<Pair<Int, Int>>> = mutableMapOf()
private fun List<Pair<Int, Int>>.moveN(
    solidRocks: List<Pair<Int, Int>>,
): List<Pair<Int, Int>> {
    return cacheN.getOrPut(this) {
        val newMovingRocks: MutableList<Pair<Int, Int>> = mutableListOf()
        (0..this.maxOf { it.second }).forEach { x ->
            val solidRocksOnColumn = solidRocks.filter { it.second == x }.sortedByDescending { it.first }
            this.filter { it.second == x }.sortedBy { it.first }.forEach { movingRock ->
                val newMovingBlocksOnColumn = newMovingRocks.filter { it.second == x }.sortedByDescending { it.first }
                val foundBlockade = solidRocksOnColumn.firstOrNull { it.first < movingRock.first }?.first
                val foundBlockade2 = newMovingBlocksOnColumn.firstOrNull { it.first < movingRock.first }?.first
                var newY = max(foundBlockade ?: -1, foundBlockade2 ?: -1)
                newY = if (newY == -1) {
                    0
                } else {
                    newY + 1
                }
                newMovingRocks.add(newY to x)
            }
        }
        if (newMovingRocks.toSet().size != newMovingRocks.size) {
            throw IllegalArgumentException()
        }
        newMovingRocks.toList()
    }
}

private fun List<Pair<Int, Int>>.moveS(
    solidRocks: List<Pair<Int, Int>>,
    lastIdx: Int,
): List<Pair<Int, Int>> {
    return cacheS.getOrPut(this) {
        val newMovingRocks: MutableList<Pair<Int, Int>> = mutableListOf()
        (0..this.maxOf { it.second }).forEach { x ->
            val solidRocksOnColumn = solidRocks.filter { it.second == x }.sortedBy { it.first }
            this.filter { it.second == x }.sortedByDescending { it.first }.forEach { movingRock ->
                val newMovingBlocksOnColumn = newMovingRocks.filter { it.second == x }.sortedBy { it.first }
                val foundBlockade = solidRocksOnColumn.firstOrNull { it.first > movingRock.first }?.first
                val foundBlockade2 = newMovingBlocksOnColumn.firstOrNull { it.first > movingRock.first }?.first
                var newY = min(foundBlockade ?: Int.MAX_VALUE, foundBlockade2 ?: Int.MAX_VALUE)
                newY = if (newY == Int.MAX_VALUE) {
                    lastIdx
                } else {
                    newY - 1
                }
                newMovingRocks.add(newY to x)
            }
        }
        if (newMovingRocks.toSet().size != newMovingRocks.size) {
            throw IllegalArgumentException()
        }
        newMovingRocks
    }
}

private fun List<Pair<Int, Int>>.moveW(
    solidRocks: List<Pair<Int, Int>>,
): List<Pair<Int, Int>> {
    return cacheW.getOrPut(this) {
        val newMovingRocks: MutableList<Pair<Int, Int>> = mutableListOf()
        (0..this.maxOf { it.first }).forEach { y ->
            val solidRocksOnRow = solidRocks.filter { it.first == y }.sortedByDescending { it.second }
            this.filter { it.first == y }.sortedBy { it.second }.forEach { movingRock ->
                val newMovingBlocksOnRow = newMovingRocks.filter { it.first == y }.sortedByDescending { it.second }
                val foundBlockade = solidRocksOnRow.firstOrNull { it.second < movingRock.second }?.second
                val foundBlockade2 = newMovingBlocksOnRow.firstOrNull { it.second < movingRock.second }?.second
                var newX = max(foundBlockade ?: -1, foundBlockade2 ?: -1)
                newX = if (newX == -1) {
                    0
                } else {
                    newX + 1
                }
                newMovingRocks.add(y to newX)
            }
        }
        if (newMovingRocks.toSet().size != newMovingRocks.size) {
            throw IllegalArgumentException()
        }
        newMovingRocks
    }
}

private fun List<Pair<Int, Int>>.moveE(
    solidRocks: List<Pair<Int, Int>>,
    lastIdx: Int,
): List<Pair<Int, Int>> {
    return cacheE.getOrPut(this) {
        val newMovingRocks: MutableList<Pair<Int, Int>> = mutableListOf()
        (0..this.maxOf { it.first }).forEach { y ->
            val solidRocksOnRow = solidRocks.filter { it.first == y }.sortedBy { it.second }
            this.filter { it.first == y }.sortedByDescending { it.second }.forEach { movingRock ->
                val newMovingBlocksOnRow = newMovingRocks.filter { it.first == y }.sortedBy { it.second }
                val foundBlockade = solidRocksOnRow.firstOrNull { it.second > movingRock.second }?.second
                val foundBlockade2 = newMovingBlocksOnRow.firstOrNull { it.second > movingRock.second }?.second
                var newX = min(foundBlockade ?: Int.MAX_VALUE, foundBlockade2 ?: Int.MAX_VALUE)
                newX = if (newX == Int.MAX_VALUE) {
                    lastIdx
                } else {
                    newX - 1
                }
                newMovingRocks.add(y to newX)
            }
        }
        if (newMovingRocks.toSet().size != newMovingRocks.size) {
            throw IllegalArgumentException()
        }
        newMovingRocks
    }
}

private fun part2(input: List<String>): Any {
    val (solidRocks, movingRocks) = parseInput(input)
    val linesNo = input.indices.last
    val columnsNo = input.first().indices.last
    var newMovingRocks = movingRocks.map { it }
    val memory: MutableSet<Set<Pair<Int, Int>>> = mutableSetOf()
    val memoryList: MutableList<Set<Pair<Int, Int>>> = mutableListOf(movingRocks.toSet())
    var cycleIndex = 0
    run breaking@{
        (1..1000000000).forEach { i ->
            newMovingRocks = newMovingRocks
                .moveN(solidRocks)
                .moveW(solidRocks)
                .moveS(solidRocks, linesNo)
                .moveE(solidRocks, columnsNo)
            if (!memory.add(newMovingRocks.toSet())) {
                println("found cycle after: $i")
                cycleIndex = memoryList.indexOf(newMovingRocks.toSet())
                return@breaking
            }
            memoryList.add(newMovingRocks.toSet())
        }
    }
    fun stateAtIndex(index: Int) = when (index < cycleIndex) {
        true -> memoryList[index]
        else -> memoryList.subList(cycleIndex, memoryList.size).let { it[(index - cycleIndex) % it.size] }
    }
    return stateAtIndex(1000000000).sumOf { input.size - it.first }
}

private fun parseInput(input: List<String>): Pair<List<Pair<Int, Int>>, List<Pair<Int, Int>>> {
    val rocks = input.mapIndexed { i, line -> line.mapIndexed { j, c -> c to (i to j) } }.flatten()
    val solidRocks = rocks.filter { it.first == '#' }.map { it.second }.sortedBy { it.first }
    val movingRocks = rocks.filter { it.first == 'O' }.map { it.second }.sortedBy { it.first }
    return Pair(solidRocks, movingRocks)
}
