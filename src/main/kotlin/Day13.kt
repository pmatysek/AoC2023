import kotlin.math.min

fun main() {
    val input = "day13".getInputLines()
    solution(input)
}
private fun solution(input: List<String>) {
    val images = input.chunkedByEmptyLine()
    val horizontalLinesReflections = findReflectionIndexes(images).flatten()
    val verticalReflections = findVerticalReflections(images).flatten()

    val correctedImages = findFixedImages(images)
    val horizontalLinesReflectionsForCorrectedImages = findReflectionIndexes(correctedImages)
        .flatten()
        .mapIndexed { index, value ->
            0.takeIf { value == horizontalLinesReflections[index] } ?: value
        }
    val verticalReflectionsForCorrectedImages = findVerticalReflections(correctedImages)
        .flatten()
        .mapIndexed { index, value ->
            0.takeIf { value == verticalReflections[index] } ?: value
        }
    println(verticalReflections.sum() + 100 * horizontalLinesReflections.sum())
    println(verticalReflectionsForCorrectedImages.sum() + 100 * horizontalLinesReflectionsForCorrectedImages.sum())
}

private fun findVerticalReflections(images: List<List<String>>) =
    findReflectionIndexes(
        images.map { image ->
            image.map {
                it.toCharArray().toList()
            }.transpose().map {
                it.joinToString("")
            }
        },
    )

private fun findReflectionIndexes(images: List<List<String>>) = images.map { image ->
    List(image.size) { index ->
        val reflectionLength = min(index + 1, image.size - index - 1)
        if (index < image.indices.last && isPerfectReflection(index, reflectionLength, image)) {
            index + 1
        } else {
            0
        }
    }
}

private fun findFixedImages(images: List<List<String>>): List<List<String>> {
    return images.map { image ->
        val hReflections = findReflectionIndexes(listOf(image)).first()
        val vReflections = findVerticalReflections(listOf(image)).first()
        image.forEachIndexed { i, line ->
            line.forEachIndexed { j, c ->
                val newImage = image.toMutableList()
                newImage[i] = newImage[i].replaceRange(j..j, c.repaired().toString())
                val newHReflections = findReflectionIndexes(listOf(newImage)).first()
                val newVReflections = findVerticalReflections(listOf(newImage)).first()
                if (
                    (newHReflections.any { it > 0 }  && newHReflections != hReflections) ||
                    (newVReflections.any { it > 0 }  && newVReflections != vReflections)
                ) {
                    return@map newImage
                }
            }
        }
        image
    }
}

fun Char.repaired() = when (this) {
    '.' -> '#'
    '#' -> '.'
    else -> throw IllegalArgumentException()
}
private fun isPerfectReflection(
    reflectionLineIndex: Int,
    reflectionLength: Int,
    image: List<String>,
) = ((reflectionLineIndex + 1) - reflectionLength..reflectionLineIndex).mapIndexed { i, lineIndex ->
    image[lineIndex] == image[reflectionLineIndex + reflectionLength - i]
}.all { it }
