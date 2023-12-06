fun main() {
    val input = "day6".getInputLines()
    println(part1(input))
    println(part2(input))
}
private fun part1(input: List<String>): Int {
    val (times, distances) = input.map { it.split(":").second().split(" ").filter { it.isNotBlank() }.map { it.toInt() } }

    val possibilities = times.mapIndexed { index, time ->
        val distance = distances[index]
        (1..time).filter {
            it * (time - it) > distance
        }.size
    }

    return possibilities.reduce { acc, value -> acc * value }
}

private fun part2(input: List<String>): Any {
    val (time, distance) = input.map { it.split(":").second().split(" ").filter { it.isNotBlank() }.joinToString("").toULong() }

    val possibilities = (1uL..time).filter {
        it * (time - it) > distance
    }.size

    return possibilities
}
