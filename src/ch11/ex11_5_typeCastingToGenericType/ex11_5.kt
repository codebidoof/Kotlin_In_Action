package ch11.ex11_5_typeCastingToGenericType

fun printSum(c: Collection<*>) {
    val intList = c as? List<Int> // Unchecked cast of 'Collection<*>' to 'List<Int>'.
        ?: throw IllegalArgumentException("List is expected")
    println(intList.sum())
}

fun main() {
    printSum(listOf(1, 2, 3))
    // 6
    printSum(listOf("a", "b", "c"))
    // Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Number
    printSum(setOf(1, 2, 3))
    // Exception in thread "main" java.lang.IllegalArgumentException: List is expected
}