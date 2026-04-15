package ch11.printContent

fun printContents(list: List<Any>) {
    println(list.joinToString())
}

fun main() {
    printContents(listOf("abc", "bac")) // List는 읽기 전용이라 안전
    // abc, bac
}