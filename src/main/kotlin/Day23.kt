import Direction.DOWN
import Direction.RIGHT

fun main() {
    val input = "day23".getInputLines()
    println(part1(input))
    println(part2(input))
}

private fun part1(input: List<String>): Any {
    val map = input.map { it.toCharArray().toList() }
    val start = 0L to 1L
    val end = map.indices.last.toLong() to (map.last().indices.last - 1).toLong()
    return map.findLongestPath(start, end, 0L)
}

private val visitedCells: MutableSet<Pair<Long, Long>> = mutableSetOf()
private fun List<List<Char>>.findLongestPath(from: Pair<Long, Long>, to: Pair<Long, Long>, currentLength: Long): Long {
    if (!this.containsPoint(from) || !visitedCells.add(from)) {
        return 0L
    }
    if (from == to) {
        return currentLength
    }
    val current = this[from]
    if (current == '#') {
        return 0L
    }
    return when (current) {
        '.' -> Direction.entries.map { findLongestPath(from.moveByVector(it.vector), to, currentLength + 1) }
        '>' -> listOf(findLongestPath(from.moveByVector(RIGHT.vector), to, currentLength + 1))
        'v' -> listOf(findLongestPath(from.moveByVector(DOWN.vector), to, currentLength + 1))
        else -> throw IllegalArgumentException()
    }.max()
}


private fun List<List<Char>>.findLongestPath2(from: Pair<Long, Long>, to: Pair<Long, Long>): Long {
    if (from == to) {
        return 0L
    }

    val stack = mutableListOf(Triple(from, 0L, mutableSetOf<Pair<Long, Long>>()))
    var longestPath = 0L
    val memory: MutableMap<Triple<Pair<Long, Long>, Long, MutableSet<Pair<Long, Long>>>, Long> = mutableMapOf()
    while (stack.isNotEmpty()) {
        val curr = stack.removeAt(stack.lastIndex)
        val (current, currentLength, visited) = curr

        if (current == to) {
            longestPath = maxOf(longestPath, currentLength)
            continue
        }

        if (!this.containsPoint(current) || this[current] == '#') {
            continue
        }

        visited.add(current)

        Direction.entries.forEach { direction ->
            val next = current.moveByVector(direction.vector)
            if (next !in visited && this.containsPoint(next)) {
                stack.add(Triple(next, currentLength + 1, HashSet(visited)))
            }
        }
    }

    return longestPath
}

private fun part2(input: List<String>): Any {
    val map = input.map { it.toCharArray().toList() }
    val start = 0L to 1L
    val end = map.indices.last.toLong() to (map.last().indices.last - 1).toLong()
    visitedCells.clear()
    return map.findLongestPath2(start, end)
}

private fun List<List<Char>>.containsPoint(point: Pair<Long, Long>) = point.first in this.indices && point.second in this.first().indices
