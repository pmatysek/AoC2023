fun main() {
    val input = "day9".getInputLines()
    println(part1(input))
    println(part2(input))
}

private fun part1(input: List<String>): Any {
    val sequences = input.map { it.split(" ").map { it.toLong() } }
    val nexts = sequences.map { it.findNextInSequence() }
    return nexts.sum()
}

private fun part2(input: List<String>): Any {
    val sequences = input.map { it.split(" ").map { it.toLong() }.reversed() }
    val nexts = sequences.map { it.findNextInSequence() }
    return nexts.sum()
}

fun List<Long>.findNextInSequence(): Long {
    var differences = this.zipWithNext().map { it.second - it.first }
    val lastElems = mutableListOf(this.last(), differences.last())
    while (!differences.all { it == 0L }) {
        differences = differences.zipWithNext().map { it.second - it.first }
        lastElems.add(differences.last())
    }
    return lastElems.sum()
}
