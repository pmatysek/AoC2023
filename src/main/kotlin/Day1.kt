fun main() {
    val input = "day1"
        .getInputLines()
        .map { it.getHiddenNumber() }
    println(input.sum())

    val input2 = "day1"
        .getInputLines()
        .map { it.getHiddenNumberByWrittenDigits() }
    println(input2.sum())
}

fun String.getHiddenNumber(): Int {
    val filtered = this.filter { it.isDigit() }
    return "${filtered.first()}${filtered.last()}".toInt()
}

fun String.getHiddenNumberByWrittenDigits(): Int {
    val firstDigit = writtenNumbers[this.findAnyOf(writtenNumbers.keys)?.second!!]
    val lastDigit = writtenNumbers[this.findLastAnyOf(writtenNumbers.keys)?.second!!]
    return "$firstDigit$lastDigit".toInt()
}

val writtenNumbers = mapOf(
    "one" to "1",
    "two" to "2",
    "three" to "3",
    "four" to "4",
    "five" to "5",
    "six" to "6",
    "seven" to "7",
    "eight" to "8",
    "nine" to "9",
    "1" to "1",
    "2" to "2",
    "3" to "3",
    "4" to "4",
    "5" to "5",
    "6" to "6",
    "7" to "7",
    "8" to "8",
    "9" to "9",
)
