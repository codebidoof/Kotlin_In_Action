package ch05.ex5_24_alsoLambda

fun main(args: Array<String>) {
    val fruits = listOf("Apple", "Banana", "Cherry")
    val upperCaseFruits = mutableListOf<String>()
    val receivedLongFruits = fruits
        .map{ it.uppercase() }
        .also { upperCaseFruits.addAll(it) }
        .filter{ it.length > 5 }
        .also { println(it) }
        .reversed()
        // [BANANA, CHERRY]
    println(upperCaseFruits)
    // [APPLE, BANANA, CHERRY]
    println(receivedLongFruits)
    // [CHERRY, BANANA]
}