

fun main() {
    val input = "day18".getInputLines()
    print(input)
}

data class LavaInput(
    val dir: LavaDir,
    val length: Int,
    val color: String,
)

private fun print(input: List<String>): Any {
    val instructions = input.map {
        val splitted = it.split(" ")
        val dir = LavaDir.valueOf(splitted.first())
        val length = splitted.second().toInt()
        val color = splitted[2].replace("(", "").replace(")", "").drop(1)
        LavaInput(dir, length, color)
    }
    var currPoint = Point3(0, 0, 0)
    val points: MutableList<Pair<Point3, String>> = mutableListOf(currPoint to "")
    instructions.forEach { input ->
        val dir = input.dir
        val length = input.length
        (0..length).forEach {
            currPoint += dir.vector
            points.add(currPoint to input.color)
        }
    }
    val maxY = points.maxOf { it.first.y }
    val maxX = points.maxOf { it.first.x }
    (0..maxX).forEach { x ->
        (0..maxY).forEach { y ->
            points.firstOrNull { it.first == Point3(x, y, 0) }?.let {
                print('#'.colored(it.second))
            } ?: print('.')
        }
        println()
    }
    return 0
}

private const val RED = "\u001b[31m"
private const val RESET_COLOR = "\u001b[0m"
private fun Char.colored(hexColor: String): String {
    if (hexColor.isBlank()) {
        return "$this"
    }
    // ANSI escape code for setting text color
    val colorCode = "\u001B[38;2;" +
        "${hexColor.substring(0, 2).toInt(16)};" +
        "${hexColor.substring(2, 4).toInt(16)};" +
        "${hexColor.substring(4, 6).toInt(16)}m"

    // ANSI escape code for resetting text color to default
    val resetColor = "\u001B[0m"

    // Print the colored character
    return "$colorCode$this$resetColor"
}
