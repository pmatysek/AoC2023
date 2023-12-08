fun main() {
    val input = "day8".getInputLines()
    println(part1(input))
    println(part2(input))
}

private fun part1(input: List<String>): Any {
    val (instructions, map) = getInstructionsAndMap(input)
    var currentElement = "AAA"
    var steps = 0uL
    while (currentElement != "ZZZ") {
        instructions.forEach {
            steps += 1uL
            currentElement = map[currentElement]!![it]!!
        }
    }
    return steps
}

private fun part2(input: List<String>): Any {
    val (instructions, map) = getInstructionsAndMap(input)
    val startingNodes = map.keys.filter { it.endsWith("A") }
    val counts = startingNodes.map {
        var steps = 0uL
        var startingNode = it
        while (!startingNode.endsWith("Z")) {
            instructions.forEach { instruction ->
                steps += 1uL
                startingNode = map[startingNode]!![instruction]!!
            }
        }
        steps
    }
    return counts.findLowestCommonMultiple()
}

private fun getInstructionsAndMap(input: List<String>): Pair<List<Char>, Map<String, Map<Char, String>>> {
    val instructions = input.first().toCharArray().toList()
    val map = input.drop(2).associate {
        val key = it.split(" = ").first()
        val (left, right) = it.split(" = ").second().drop(1).dropLast(1).split(", ")
        key to mapOf(
            'L' to left,
            'R' to right,
        )
    }
    return instructions to map
}
