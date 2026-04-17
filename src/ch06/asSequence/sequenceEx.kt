package ch06.asSequence

import ch06.filterAndMap.Person

fun main() {
    val people = listOf(
        Person("Alice", 29),
        Person("Bob", 31),
        Person("Charlie", 31),
        Person("Dan", 21)
    )

    //map 먼저 수행한 후 filter 수행
    println(
        people
            .asSequence()
            .map(Person::name)
            .filter{ it.length < 4}
            .toList()
    )
    // [Bob, Dan]

    //filter 다음 map 수행
    println(
        people
            .asSequence()
            .filter{ it.name.length < 4}
            .map(Person::name)
            .toList()
    )
    // [Bob, Dan]
}