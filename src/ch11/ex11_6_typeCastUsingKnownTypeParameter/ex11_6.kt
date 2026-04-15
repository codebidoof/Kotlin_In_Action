package ch11.ex11_6_typeCastUsingKnownTypeParameter

fun printSum(c: Collection<Int>) { //컴파일 시점에 원소 타입이 일려져 있으므로...
    when (c) {
        is List<Int> -> println("List sum: ${c.sum()}") //... 이 타입 검사는 올바르다
        is Set<Int> -> println("Set sum: ${c.sum()}")
    }
}

fun main() {
    printSum(listOf(1, 2, 3))
    // List sum: 6
    printSum(setOf(3, 4, 5))
    // Set sum: 12
}