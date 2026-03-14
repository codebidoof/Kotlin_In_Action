package ch05.ex5_6_TransferLambda

import ch05.ex5_4_SearchWithMaxByOrNull.Person

fun main() {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))

//    val names = people.joinToString(
//        separator = " ",
//        transform = {p: Person -> p.name}
//    )
    val names = people.joinToString(separator = " ") { p: Person -> p.name}
    println(names)
    // Alice Bob
}