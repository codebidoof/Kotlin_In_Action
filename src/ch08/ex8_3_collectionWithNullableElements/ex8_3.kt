package ch08.ex8_3_collectionWithNullableElements

fun readNumbers2(text: String): List<Int?> =
    text.lineSequence().map { it.toIntOrNull() }.toList()