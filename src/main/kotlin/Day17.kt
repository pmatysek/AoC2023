import Direction.DOWN
import Direction.LEFT
import Direction.RIGHT
import Direction.UP
import java.util.PriorityQueue
import kotlin.math.min

var matrix: List<List<Int>> = emptyList()
fun main() {
    matrix = "day17".getInputLines().map { it.map { it.digitToIntOrNull()!! } }
    val target = matrix.indices.last to matrix.first().indices.last
    val startNode = Node(
        point = 0 to 0,
        dirLength = 0,
        dir = null,
    )
    solve(startNode, canGoMap) { node -> node.point == target }
    solve(startNode, canGoMap2) { node -> node.point == target && node.dirLength > 3 }
}

private fun solve(
    startNode: Node,
    canGo: Map<Direction, List<List<Direction>>>,
    endCondition: (Node) -> Boolean,
) {
    val queue = PriorityQueue(
        compareBy<NodeWithHeat> { it.node.point.first + it.node.point.second }
            .then(compareBy { it.heat }),
    )
    queue.add(NodeWithHeat(startNode, 0))
    val visited: MutableSet<Node> = mutableSetOf()
    var min = Int.MAX_VALUE
    while (queue.isNotEmpty()) {
        val nodeWithHeat = queue.remove()
        val node = nodeWithHeat.node
        if (endCondition.invoke(node)) {
            min = min(min, nodeWithHeat.heat)
            continue
        }
        if (!visited.add(node)) {
            continue
        }

        val nodesToGo = if (node.dir == null) {
            listOf(
                node.go(RIGHT),
                node.go(DOWN),
            )
        } else {
            canGo[node.dir]!![(node.dirLength - 1)].map {
                node.go(it)
            }
        }
        nodesToGo.filterNotNull().forEach {
            queue.add(
                NodeWithHeat(
                    it,
                    nodeWithHeat.heat + matrix[it.point.first][it.point.second],
                ),
            )
        }
    }
    println(min)
}

val canGoMap = mapOf(
    UP to listOf(listOf(UP, LEFT, RIGHT), listOf(UP, LEFT, RIGHT), listOf(LEFT, RIGHT)),
    DOWN to listOf(listOf(DOWN, LEFT, RIGHT), listOf(DOWN, LEFT, RIGHT), listOf(LEFT, RIGHT)),
    LEFT to listOf(listOf(LEFT, DOWN, UP), listOf(LEFT, DOWN, UP), listOf(UP, DOWN)),
    RIGHT to listOf(listOf(RIGHT, DOWN, UP), listOf(RIGHT, DOWN, UP), listOf(UP, DOWN)),
)

val canGoMap2 = mapOf(
    UP to List(3) { listOf(UP) } + List(6) { listOf(UP, LEFT, RIGHT) } + listOf(listOf(LEFT, RIGHT)),
    DOWN to List(3) { listOf(DOWN) } + List(6) { listOf(DOWN, LEFT, RIGHT) } + listOf(listOf(LEFT, RIGHT)),
    LEFT to List(3) { listOf(LEFT) } + List(6) { listOf(LEFT, DOWN, UP) } + listOf(listOf(DOWN, UP)),
    RIGHT to List(3) { listOf(RIGHT) } + List(6) { listOf(RIGHT, DOWN, UP) } + listOf(listOf(DOWN, UP)),
)

data class NodeWithHeat(
    val node: Node,
    val heat: Int,
)
data class Node(
    val point: Pair<Int, Int>,
    val dir: Direction?,
    val dirLength: Int,
) {
    fun go(dir: Direction) = Node(
        point = point.moveByVector(dir.vector),
        dir = dir,
        dirLength = if (this.dir == dir) { dirLength + 1 } else 1,
    ).takeIf { it.point.first in matrix.indices && it.point.second in matrix.first().indices }
}