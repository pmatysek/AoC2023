fun main() {
    val input = "day7".getInputLines()
    println(part1(input))
    println(part2(input))
}

private fun part1(input: List<String>): Any {
    val hands = input.toHandsWithBids().sortedWith(handsComparator)
    return hands.mapIndexed { index, pair -> (index + 1) * pair.second }.sum()
}

private val handsComparator = Comparator<Pair<String, Long>> { hand1, hand2 ->
    val score1 = hand1.first.getScore()
    val score2 = hand2.first.getScore()
    when {
        score1 > score2 -> 1
        score1 < score2 -> -1
        else -> compareCards(hand1.first, hand2.first, cardTypes)
    }
}

fun compareCards(first: String, second: String, cardTypesList: List<Char>): Int {
    first.forEachIndexed { index, card ->
        val score1 = cardTypesList.indexOf(card)
        val score2 = cardTypesList.indexOf(second[index])
        if (score1 < score2) {
            return 1
        }
        if (score1 > score2) {
            return -1
        }
    }
    return 0
}

val cardTypes = listOf('A', 'K', 'Q', 'J', 'T', '9', '8', '7', '6', '5', '4', '3', '2', '1')
val cardTypes2 = listOf('A', 'K', 'Q', 'T', '9', '8', '7', '6', '5', '4', '3', '2', '1', 'J')
private fun String.getScore() = when {
    numberOfCommonsCharsSetsOfLength(5) == 1 -> 7
    numberOfCommonsCharsSetsOfLength(4) == 1 -> 6
    numberOfCommonsCharsSetsOfLength(3) == 1 && numberOfCommonsCharsSetsOfLength(2) == 1 -> 5
    numberOfCommonsCharsSetsOfLength(3) == 1 -> 4
    numberOfCommonsCharsSetsOfLength(2) == 2 -> 3
    numberOfCommonsCharsSetsOfLength(2) == 1 -> 2
    else -> 1
}

private fun String.getScore2() =
    if (this.contains('J')) {
        cardTypes.maxOfOrNull { this.replace('J', it).getScore() }!!
    } else {
        getScore()
    }

private fun String.numberOfCommonsCharsSetsOfLength(n: Int) = this.groupBy { it }.map { it.value.count() }.count { it == n }

private fun part2(input: List<String>): Any {
    val hands = input.toHandsWithBids().sortedWith(handsComparator2)
    return hands.mapIndexed { index, pair -> (index + 1) * pair.second }.sum()
}

private fun List<String>.toHandsWithBids(): List<Pair<String, Long>> = map {
    val splitted = it.split(" ")
    splitted.first() to splitted.second().toLong()
}

private val handsComparator2 = Comparator<Pair<String, Long>> { hand1, hand2 ->
    val score1 = hand1.first.getScore2()
    val score2 = hand2.first.getScore2()
    when {
        score1 > score2 -> 1
        score1 < score2 -> -1
        else -> compareCards(hand1.first, hand2.first, cardTypes2)
    }
}
