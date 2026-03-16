package ch06.applyPredicateToCollection

import ch06.filterAndMap.Person

val canBeInClub27 = {p: Person -> p.age <= 27} //Boolean값을 반환

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 27), Person("Bob", 31))
    println(people.all(canBeInClub27))
    // false

    println(people.any(canBeInClub27))
    // true

    val list = listOf(1, 2, 3,)
    println(list.none{ it == 4})
    // true

    println(people.count(canBeInClub27))
    // 1

    println(people.find(canBeInClub27))
    // Person(name=Alice, age=27)
}
