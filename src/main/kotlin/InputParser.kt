import java.io.File

fun String.getInputLines() = File("src/main/resources/$this.input").readLines()

fun List<String>.chunkedByEmptyLine() = this.chunkedBy("")
fun List<String>.chunkedBy(delimiter: String) = this.joinToString("|").split("|$delimiter|").map { it.split("|") }
