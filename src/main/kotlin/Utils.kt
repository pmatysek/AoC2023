import kotlin.math.max

inline fun <reified T> List<List<T>>.transpose(): MutableList<MutableList<T?>> {
    val transposed = MutableList(this.first().size) { MutableList<T?>(this.size) { null } }
    for (i in this.indices) {
        for (j in this.first().indices) {
            transposed[j][i] = this[i][j]
        }
    }
    return transposed
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

fun <T>Pair<Int, Int>.isOnMatrix(matrix: List<List<T>>) =
    first in matrix.indices && second in matrix.first().indices

fun <T> List<T>.combinations(): Sequence<Pair<T, T>> = sequence {
    for (i in 0..<size - 1)
        for (j in i + 1..<size)
            yield(get(i) to get(j))
}
