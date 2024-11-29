import java.math.BigDecimal
import kotlin.math.max

inline fun <reified T> List<List<T>>.transpose(): List<List<T>> {
    val transposed = MutableList(this.first().size) { MutableList<T?>(this.size) { null } }
    for (i in this.indices) {
        for (j in this.first().indices) {
            transposed[j][i] = this[i][j]
        }
    }
    return transposed.map { it.map { it!! } }
}

fun <T> arrayDequeOf(vararg elements: T) = ArrayDeque(elements.toList())

fun findCommonCharsInStrings(strings: List<String>) =
    strings.reduce { acc, next -> acc.toSet().intersect(next.toSet()).joinToString() }

fun String.findFirstUniqueSequenceOf(n: Int) = this.windowed(n).indexOfFirst { it.allCharsUnique() }

fun String.allCharsUnique(): Boolean = all(hashSetOf<Char>()::add)

fun <E> List<E>.second() = this[1]

fun List<ULong>.findCommonDivisor(): ULong {
    var divisor = 1UL
    var i = 1UL
    while (this.all { i <= it }) {
        if (this.all { it % i == 0UL }) {
            divisor = i
        }
        i++
    }
    return divisor
}

fun List<ULong>.findLowestCommonMultiple() = reduce { acc, value -> findLowestCommonMultiple(acc, value) }
fun findLowestCommonMultiple(a: ULong, b: ULong): ULong {
    val larger = max(a, b)
    val maxCommonMultiple = a * b
    var lowestCommonMultiple = larger
    while (lowestCommonMultiple <= maxCommonMultiple) {
        if (lowestCommonMultiple % a == 0uL && lowestCommonMultiple % b == 0uL) {
            return lowestCommonMultiple
        }
        lowestCommonMultiple += larger
    }
    return maxCommonMultiple
}

fun <T> List<List<T>>.findCoordinatesOf(element: T): Pair<Int, Int> {
    val foundRow: Int = this.indexOf(this.first { it.contains(element) })
    val foundColumn = this[foundRow].indexOf(element)
    return foundRow to foundColumn
}

fun String.takeIfMatchesRegex(regex: Regex): String? = this.takeIf { regex.matches(it) }
fun List<Char>.takeIfMatchesRegex(regex: Regex): List<Char>? =
    this.joinToString("").takeIf { regex.matches(it) }?.toCharArray()?.toList()

fun Collection<Char>.toNumberExcludingNonDigits() = this
    .filter { it.isDigit() }
    .joinToString("")
    .toInt()

fun <T> List<T>.subListCoercedIn(fromIndex: Int, toIndex: Int) =
    subList(fromIndex.coerceIn(indices), toIndex.coerceIn(0..this.size))

fun Pair<Int, Int>.moveByVector(vector: Pair<Int, Int>) = (first + vector.first) to (second + vector.second)
fun Pair<Long, Long>.moveByVector(vector: Pair<Long, Long>) = (first + vector.first) to (second + vector.second)
fun Pair<Long, Long>.moveByVector(vector: Pair<Int, Int>) = (first + vector.first) to (second + vector.second)

fun <T>Pair<Int, Int>.isOnMatrix(matrix: List<List<T>>) =
    first in matrix.indices && second in matrix.first().indices

fun <T> List<T>.combinations(): Sequence<Pair<T, T>> = sequence {
    for (i in 0..<size - 1)
        for (j in i + 1..<size)
            yield(get(i) to get(j))
}

fun newton(k: Long, n: Long) =
    n.factorial() / (k.factorial() * (n - k).factorial())

fun Long.factorial() = (1..this).reduce { acc, number ->
    acc * number
}

enum class Direction(
    val vector: Pair<Int, Int>,
) {
    UP(
        vector = -1 to 0,
    ),
    DOWN(
        vector = 1 to 0,
    ),
    LEFT(
        vector = 0 to -1,
    ),
    RIGHT(
        vector = 0 to 1,
    ),
}

data class Point3(
    val x: Long,
    val y: Long,
    val z: Long,
) {
    fun moveByVector(vector: Pair<Long, Long>): Point3 {
        return this.copy(
            x = x + vector.first,
            y = y + vector.second,
        )
    }
    fun moveByVector(vector: Point3): Point3 {
        return this.copy(
            x = x + vector.x,
            y = y + vector.y,
            z = z + vector.z,
        )
    }
}

data class DobulePoint3(
    val x: Double,
    val y: Double,
    val z: Double,
) {
    fun moveByVector(vector: Pair<Long, Long>): DobulePoint3 {
        return this.copy(
            x = x + vector.first,
            y = y + vector.second,
        )
    }
    fun moveByVector(vector: Point3): DobulePoint3 {
        return this.copy(
            x = x + vector.x,
            y = y + vector.y,
            z = z + vector.z,
        )
    }
}

data class BigDecimalPoint3(
    val x: BigDecimal,
    val y: BigDecimal,
    val z: BigDecimal,
) {
    fun moveByVector(vector: Pair<Long, Long>): BigDecimalPoint3 {
        return this.copy(
            x = x + vector.first.toBigDecimal(),
            y = y + vector.second.toBigDecimal(),
        )
    }
    fun moveByVector(vector: Point3): BigDecimalPoint3 {
        return this.copy(
            x = x + vector.x.toBigDecimal(),
            y = y + vector.y.toBigDecimal(),
            z = z + vector.z.toBigDecimal(),
        )
    }

    fun moveByVector(vector: BigDecimalPoint3): BigDecimalPoint3 {
        return this.copy(
            x = x + vector.x,
            y = y + vector.y,
            z = z + vector.z,
        )
    }
}