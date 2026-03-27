package ch08.ex8_2_collectionWithNullableElements

fun readNumbers(text: String): List<Int?> {
    val result = mutableListOf<Int?>()
    for(line in text.lineSequence()) {
        val numberOrNull = line.toIntOrNull()
        result.add(numberOrNull)
    }
    return result
}