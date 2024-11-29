import java.math.BigDecimal

fun main() {
    val input = "day24".getInputLines()
    val pointsWithVectors = mapInput(input, true)
    val lines = pointsWithVectors.map { (p1, vector) ->
        val p2 = p1.moveByVector(vector)
        p1 to p2
    }
    val linesCombinations = lines.combinations()
    val intersectionPoints = linesCombinations.map { (line1, line2) ->
        return@map calculateIntersectionPoint(line1, line2)
    }
    // println(intersectionPoints.filterNotNull().count())
    val intersectedPointsInArea = intersectionPoints.filterNotNull().filter {
        val range = 200000000000000.0.toBigDecimal()..400000000000000.0.toBigDecimal()
        // val range = 7.0.toBigDecimal()..27.0.toBigDecimal()
        it.x in range && it.y in range
    }
    println(intersectedPointsInArea.count())
}

private fun calculateIntersectionPoint(
    line1: Pair<BigDecimalPoint3, BigDecimalPoint3>,
    line2: Pair<BigDecimalPoint3, BigDecimalPoint3>,
): BigDecimalPoint3? {
    val (p1, p2) = line1
    val (p3, p4) = line2
    val (x1, y1, z1) = p1
    val (x2, y2, z2) = p2
    val (x3, y3, z3) = p3
    val (x4, y4, z4) = p4
    val denominator = ((x1 - x2) * (y3 - y4)) - ((y1 - y2) * (x3 - x4))
    if (denominator == BigDecimal.ZERO) {
        return null
    }
    val instersectedX = (((x1 * y2 - y1 * x2) * (x3 - x4)) - ((x1 - x2) * (x3 * y4 - y3 * x4))) / denominator
    val instersectedY = (((x1 * y2 - y1 * x2) * (y3 - y4)) - ((y1 - y2) * (x3 * y4 - y3 * x4))) / denominator

    if (x2 > x1 && instersectedX < x1 || x2 < x1 && instersectedX > x1 || y2 > y1 && instersectedY < y1 || y2 < y1 && instersectedY > y1 ||
        x4 > x3 && instersectedX < x3 || x4 < x3 && instersectedX > x3 || y4 > y3 && instersectedY < y3 || y4 < y3 && instersectedY > y3
    ) {
        return null
    }
    return BigDecimalPoint3(instersectedX, instersectedY, BigDecimal.ZERO)
}

fun mapInput(input: List<String>, ignoreZaxis: Boolean): List<Pair<BigDecimalPoint3, BigDecimalPoint3>> {
    return input.map {
        val (p1, p2) = it.split(" @ ").map {
            val (x, y, z) = it.split(",").map { it.replace(" ", "").toBigDecimal() }
            BigDecimalPoint3(
                x = x,
                y = y,
                z = z.takeIf { !ignoreZaxis } ?: BigDecimal.ZERO,
            )
        }
        p1 to p2
    }
}
