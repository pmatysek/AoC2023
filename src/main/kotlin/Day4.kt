import kotlin.math.pow

fun main() {
    val input = "day4".getInputLines()
    println(part1(input))
    println(part2(input))
}

private fun part1(input: List<String>): Any {
    val numbers = input.map { it.toListOfNumbers() }.map { 2.0.pow(it.getNumberOfWinningNumbers() - 1).toInt() }
    return numbers.sum()
}

private fun Pair<List<Int>, List<Int>>.getNumberOfWinningNumbers(): Int {
    return first.count { second.contains(it) }
}

private fun part2(input: List<String>): Any {
    val numbers = input.map { it.toListOfNumbers() }
    val noOfWinners = numbers.map { it.getNumberOfWinningNumbers() }.toMutableList()
    val numberOfCards = List(noOfWinners.size) { 1 }.toMutableList()
    noOfWinners.forEachIndexed { i, value ->
        (1..numberOfCards[i]).forEach { _ ->
            (1..value).forEach {
                if (i + it < noOfWinners.size) {
                    numberOfCards[i + it] += 1
                }
            }
        }
    }
    return numberOfCards.sum()
}

private fun String.toListOfNumbers(): Pair<List<Int>, List<Int>> {
    val numbers = this.split(":").second()
    val (list1, list2) = numbers.split("|").map { it.trim().split(" ").filter { it.isNotBlank() }.map { it.toInt() } }

    return list1 to list2
}
