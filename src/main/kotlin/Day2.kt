val startings = mapOf(
    "red" to 12,
    "green" to 13,
    "blue" to 14,
)

fun main() {
    val input = "day2".getInputLines().map { it.toGame() }
    println(part1(input))
    println(part2(input))
}

private fun part1(games: List<Game>): Any {
    return games.filter { it.isPossible() }.sumOf { it.id }
}

private fun part2(games: List<Game>): Any {
    return games.sumOf { it.steps.toPowerOfColors() }
}

fun String.getColorWithNumber(): Pair<String, Int> {
    val prepared = this.substring(1).split(" ")
    return prepared.last() to prepared.first().toInt()
}

data class Game(
    val id: Int,
    val steps: List<Map<String, Int>>,
) {
    fun isPossible(): Boolean {
        val areStepsValid = steps.map { step ->
            step.map {
                startings[it.key]!! >= it.value
            }
        }
        return areStepsValid.all { steps -> steps.all { it } }
    }
}

private fun String.toGame(): Game {
    val splitted = this.split(":")
    val id = splitted.first().split(" ").last().toInt()
    val steps = splitted.second().split(";").map { it.split(",").associate { it.getColorWithNumber() } }
    return Game(
        id = id,
        steps = steps,

    )
}
private fun List<Map<String, Int>>.toPowerOfColors(): Int {
    val blues = this.map { it["blue"] ?: 0 }
    val reds = this.map { it["red"] ?: 0 }
    val green = this.map { it["green"] ?: 0 }
    return blues.max() * reds.max() * green.max()
}
