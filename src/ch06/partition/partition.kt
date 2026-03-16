package ch06.partition

import ch06.applyPredicateToCollection.canBeInClub27
import ch06.filterAndMap.Person

fun main(args: Array<String>) {
    val people = listOf(
        Person("Alice", 26),
        Person("Bob", 29),
        Person("Carol", 31)
    )

//    val comeIn = people.filter(canBeInClub27)
//    val stayOut = people.filterNot(canBeInClub27)
//    println(comeIn)
    // [Person(name=Alice, age=26)]
//    println(stayOut)
    // [Person(name=Bob, age=29), Person(name=Carol, age=31)]

    val (comeIn, stayOut) = people.partition(canBeInClub27)
    println(comeIn)
    // [Person(name=Alice, age=26)]
    println(stayOut)
    // [Person(name=Bob, age=29), Person(name=Carol, age=31)]

}