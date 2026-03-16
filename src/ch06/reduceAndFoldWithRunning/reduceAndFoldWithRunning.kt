package ch06.reduceAndFoldWithRunning

import ch06.filterAndMap.Person

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4)
    val summed = list.runningReduce { acc, element ->
        acc + element
    }
    println(summed)
    // [1, 3, 6, 10]

    val multiplied = list.runningReduce { acc, element ->
        acc * element
    }
    println(multiplied)
    // [1, 2, 6, 24]

    val people = listOf(
        Person("Alex", 29),
        Person("Natalia", 28),
    )
    println(people.runningFold("") {
        acc, person -> acc + person.name
    })
    // [, Alex, AlexNatalia]
}