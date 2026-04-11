package ch10.ex10_5_DefaultValueOfFunctionTypeParameter

fun <T> Collection<T>.joinToString(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = "",
    transform: (T) -> String = { it.toString() } //함수 타입 파라미터를 선언하면서 람다를 기본값으로 지정한다.
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(transform(element)) //transform 파라미터에 대한 인자로 받은 함수를 호출한다.
    }

    result.append(postfix)
    return result.toString()
}

fun main() {
    val letters = listOf("Alpha", "Beta")
    println(letters.joinToString()) // 디폴트 변환 함수를 사용한다.
    // Alpha, Beta
    println(letters.joinToString{ it.uppercase() }) //람다를 인자로 전달한다
    // ALPHA, BETA
    println(letters.joinToString { it.lowercase() })
    // alpha, beta
    println(letters.joinToString(separator = "! ", postfix = "! ") { it.uppercase() }) //여러 인자를 전달한다
    // ALPHA! BETA!

}