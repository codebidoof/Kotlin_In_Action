package ch11.ex11_3_UpperBoundTypeParameter

fun <T: Comparable<T>> max(first: T, second: T): T { // 이 함수의 인자들은 비교가능해야 한다
    return if (first > second) first else second
}

fun main() {
    println(max("kotlin", "java"))
    // kotlin
}