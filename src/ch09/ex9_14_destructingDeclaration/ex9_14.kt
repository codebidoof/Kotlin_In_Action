package ch09.ex9_14_destructingDeclaration

data class NameComponents(val name: String,
    val extension: String)

fun splitFilename(fullName: String): NameComponents {
    val result = fullName.split('.', limit = 2) //limit: 문자열을 몇 덩어리까지 나눌지 제한하는 옵션
    return NameComponents(result[0], result[1])
}

fun main() {
    val (name, ext) = splitFilename("example.kt")
    println(name)
    // example
    println(ext)
    // kt
}