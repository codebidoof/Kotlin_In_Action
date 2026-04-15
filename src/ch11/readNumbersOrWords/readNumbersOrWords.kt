package ch11.readNumbersOrWords

fun readNumbersOrWords(): List<Any> {
    val input = readln()
    val words: List<String> = input.split(",")
    val numbers: List<Int> = words.mapNotNull { it.toIntOrNull() }
    return numbers.ifEmpty { words }
}

fun printList(l: List<Any>) {
//    when(l) {
//        is List<String> -> println("Strings: $l") // Cannot check for instance of erased type 'List<String>'.
//        is List<Int> -> println("Integers: $l") // Cannot check for instance of erased type 'List<Int>'.
//
//    }
}

fun main() {
    val list = readNumbersOrWords()
    printList(list)
}