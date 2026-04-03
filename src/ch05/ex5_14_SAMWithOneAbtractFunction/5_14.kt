package ch05.ex5_14_SAMWithOneAbtractFunction

fun interface IntCondition {
    fun check(i: Int): Boolean //추상 메서드는 정확히 하나만 존재한다
    fun checkString(s: String) = check(s.toInt()) // 비추상 메서드가 더 있어도 된다.
    fun checkChar(c: Char) = check(c.digitToInt())
}

fun main() {
    val isOdd = IntCondition { it % 2 != 0 } // SAM 생성자 사용
    println(isOdd.check(1))
    // true
    println(isOdd.checkString("2"))
    // false
    println(isOdd.checkChar('3'))
    // true
}