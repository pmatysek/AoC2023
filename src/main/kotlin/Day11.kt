import kotlin.math.abs

fun main() {
    val input = "day11".getInputLines()
    println(solution(input, 2))
    println(solution(input, 1000000))
}
private fun solution(input: List<String>, n: Int): Any {
    val galaxies = input.map { it.toCharArray().toList() }.expandGalaxiesBy(n)
        .asSequence()
        .mapIndexed { i, chars -> chars.mapIndexed { j, c -> (i.toLong() to j.toLong()) to c } }
        .flatten()
        .filter { it.second.first == '#' }.map { (it.first.first + it.second.second.first) to (it.first.second + it.second.second.second) }
        .toList()
    val pointsPairs = galaxies.combinations().toList()
    val distances = pointsPairs.map { (p1, p2) -> abs(p1.first - p2.first) + abs(p1.second - p2.second) }
    return distances.sum()
}
private fun List<List<Char>>.expandGalaxiesBy(n: Int): List<List<Pair<Char, Pair<Long, Long>>>> {
    var expanded = this.map { it.map { it to (0L to 0L) } }
    var counter = 0
    this.forEachIndexed { index, row ->
        if (row.all { it == '.' }) {
            expanded = expanded.mapIndexed { eRowIndex, eRow ->
                if (eRowIndex > index) {
                    eRow.map { it.first to ((it.second.first + n - 1) to it.second.second) }
                } else {
                    eRow
                }
            }
            counter += (n - 1)
        }
    }
    var expanded2 = expanded.transpose().map { it.map { it } }
    counter = 0
    expanded.transpose().forEachIndexed { index, row ->
        if (row.all { it!!.first == '.' }) {
            expanded2 = expanded2.mapIndexed { eRowIndex, eRow ->
                if (eRowIndex > index) {
                    eRow.map { it!!.first to (it.second.first to (it.second.second + n - 1)) }
                } else {
                    eRow
                }
            }
            counter += (n - 1)
        }
    }
    return expanded2.transpose().map { it.map { it!! } }
}
