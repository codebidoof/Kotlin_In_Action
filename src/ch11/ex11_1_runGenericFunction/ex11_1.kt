package ch11.ex11_1_runGenericFunction

fun main() {
    val letters = ('a'..'z').toList()
    println(letters.slice<Char>(0..2)) // 타입 인자를 명시적으로 지정
    // [a, b, c]
    println(letters.slice(10..13)) //컴파일러는 여기서 T가 Char이라는 사실을 추론한다
    // [k, l, m, n]
}