package ch11.ex11_7_functionUsingReifiedTypeParameter

inline fun <reified T> isA(value: Any) = value is T // 이제는 이 코드가 컴파일된다

fun main() {
    println(isA<String>("abc"))
    // true
    println(isA<String>(123))
    // false
}