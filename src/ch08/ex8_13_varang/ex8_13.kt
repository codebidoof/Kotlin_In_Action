package ch08.ex8_13_varang

fun main() {
    val strings = listOf("a", "b", "c")
    println("%s/%s/%s".format(*strings.toTypedArray()))
    // a/b/c
}