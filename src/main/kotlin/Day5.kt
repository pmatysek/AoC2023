fun main() {
    val input = "day5".getInputLines()
    println(part1(input))
    println(part2(input))
}

private fun part1(input: List<String>): Any {
    val seeds: MutableList<MutableMap<Long, Long>> = listOf(
        input[0].split(":")
            .second()
            .split(" ")
            .filter { it.isNotBlank() }
            .map { it.toLong() }
            .associateWith { it },
    ).map { it.toMutableMap() }.toMutableList()
    input.chunkedByEmptyLine().subList(1, 8).forEachIndexed { mapIndex, map ->
        map.forEachIndexed { index, it ->
            if (index != 0) {
                val (destinationStart, sourceStart, rangeLength) = it.split(" ").map { it.toLong() }
                seeds[mapIndex].forEach {
                    if (it.key in (sourceStart..<(sourceStart + rangeLength))) {
                        seeds[mapIndex][it.key] = it.key + (destinationStart - sourceStart)
                    }
                }
            }
        }
        seeds.add(seeds[mapIndex].map { it.value }.associateWith { it }.toMutableMap())
    }

    val seedsToLocation = seeds[0].keys.associateWith { seed ->
        var location = seed
        seeds.forEach {
            location = it[location]!!
        }
        location
    }
    return seedsToLocation.minBy { it.value }
}

private fun part2(input: List<String>): Any {
    val initialSeeds = input[0]
        .split(":")
        .second()
        .split(" ")
        .filter { it.isNotBlank() }
        .map { it.toLong() }
        .chunked(2)
        .map { it.first()..(it.second() - 1L + it.first()) }

    val ranges: MutableList<MutableMap<LongRange, Long>> = mutableListOf()
    input.chunkedByEmptyLine().subList(1, 8).forEachIndexed { mapIndex, map ->
        ranges.add(mutableMapOf())
        map.forEachIndexed { index, it ->
            if (index != 0) {
                val (destinationStart, sourceStart, rangeLength) = it.split(" ").map { it.toLong() }

                ranges[mapIndex][(sourceStart..<(sourceStart + rangeLength))] = (destinationStart - sourceStart)
            }
        }
    }

    var min = Long.MAX_VALUE
    initialSeeds.forEach {
        it.forEach {
            var value = it
            ranges.forEach {
                value += (it.filter { value in it.key }.values.firstOrNull() ?: 0)
            }
            if (value < min) {
                min = value
            }
        }
    }
    return min
}
