package ch07.ex7_4_elvis

fun strLenSafe(s: String?): Int = s?.length ?: 0

fun main(args: Array<String>) {
    println(strLenSafe("abc"))
    // 3
    println(strLenSafe(null))
    // 0
}