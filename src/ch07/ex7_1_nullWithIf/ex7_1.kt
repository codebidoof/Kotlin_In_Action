package ch07.ex7_1_nullWithIf

fun strLenSafe(s: String?): Int =
    if (s != null) s.length else 0

fun main() {
    val x: String? = null
    println(strLenSafe(x))
    // 0
    println(strLenSafe("abc"))
    // 3
}