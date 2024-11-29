import kotlin.math.max
import kotlin.math.min

fun main() {
    val bricks = "day22".getInputLines().map {
        val splitted = it.split('~')
        val (x1, y1, z1) = splitted.first().split(",").map { it.toLong() }
        val (x2, y2, z2) = splitted.second().split(",").map { it.toLong() }
        Brick(
            start = Point3(x1, y1, z1),
            end = Point3(x2, y2, z2),
            name = "$x1$x2$y1$y2$z1$z2",
        )
    }

    val settledBricks = bricks.settleDownCounted().first
    val canBeDesintegrated = settledBricks.filter { !(settledBricks - it).settle().second }
    println(canBeDesintegrated.size)

    val desintegrated = settledBricks.filter { (settledBricks - it).settle().second }
    val numberOfFallen = desintegrated.map { (settledBricks - it).settleDownCounted().second }
    println(numberOfFallen.sum())
}

private fun List<Brick>.settleDownCounted(): Pair<List<Brick>, Int> {
    var noOfFalled = 1
    var settledBricks = this.toMutableList().sortedByDescending { it.maxZ }
    while (noOfFalled > 0) {
        val result = settledBricks.settleCounted()
        settledBricks = result.first.sortedByDescending { it.maxZ }
        noOfFalled = result.second
    }
    val totalNoOfFalled = this.count { it !in settledBricks }
    return settledBricks to totalNoOfFalled
}

private fun List<Brick>.settleCounted(): Pair<List<Brick>, Int> {
    var noOfFalled = 0
    val bricks = this.map { brick ->
        if (brick.minZ == 1L) {
            brick
        } else {
            val vector = getVectorToMove(brick)
            if (vector.z < 0) {
                noOfFalled += 1
            }
            brick.copy(
                start = brick.start.moveByVector(vector),
                end = brick.end.moveByVector(vector),
            )
        }
    }
    return bricks to noOfFalled
}
private fun List<Brick>.settle(): Pair<List<Brick>, Boolean> {
    var movedAny = false
    val bricks = this.map { brick ->
        if (brick.minZ == 1L) {
            brick
        } else {
            val vector = getVectorToMove(brick)
            if (vector.z < 0) {
                movedAny = true
            }
            brick.copy(
                start = brick.start.moveByVector(vector),
                end = brick.end.moveByVector(vector),
            )
        }
    }
    return bricks to movedAny
}

private fun List<Brick>.getVectorToMove(brick: Brick): Point3 {
    val foundLowerBrick =
        this.firstOrNull { it.maxZ < brick.minZ && (it.minX..it.maxX).any { it in brick.minX..brick.maxX } && (it.minY..it.maxY).any { it in brick.minY..brick.maxY } }
    val vector = foundLowerBrick?.let {
        Point3(0, 0, -1 * (brick.minZ - it.maxZ - 1))
    } ?: Point3(0, 0, -1 * (brick.minZ - 1))
    return vector
}

data class Brick(
    val name: String,
    val start: Point3,
    val end: Point3,
) {
    val maxZ = max(start.z, end.z)
    val minZ = min(start.z, end.z)
    val maxX = max(start.x, end.x)
    val minX = min(start.x, end.x)
    val maxY = max(start.y, end.y)
    val minY = min(start.y, end.y)
}
