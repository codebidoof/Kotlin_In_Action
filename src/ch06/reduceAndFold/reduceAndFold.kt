package ch06.reduceAndFold

import ch06.filterAndMap.Person

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4)
    println(list.reduce { acc, element ->
        acc + element
    })
    // 10
    println(list.reduce { acc, element ->
        acc*element
    })
    // 24

    val people = listOf(Person("Alex", 29), Person("Natalia", 28))
    val folded = people.fold("") {
        acc, person -> acc + person.name
    }
    println(folded)
    // AlexNatalia
}