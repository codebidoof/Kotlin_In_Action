package ch10.ex10_2_simpleFilterFunction

fun String.filter(predicate: (Char) -> Boolean): String {
    return buildString {
        for (char in this@filter) { // 입력 문자열을 한 문자씩 이터레이션한다.
            if (predicate(char)) append(char) // predicate 파라미터로 전달받은 함수를 호출한다.
        }
    }
}

fun main() {
    println("ab1c".filter { it in 'a'..'z' }) // 람다를 predicate 파라미터로 전달
}

