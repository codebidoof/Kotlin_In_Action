package ch08.ex8_12_ArrayWithString

fun main() {
    val letters = Array<String>(26) { i -> ('a' + i).toString() }
    println(letters.joinToString(""))
}