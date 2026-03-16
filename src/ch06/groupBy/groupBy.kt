package ch06.groupBy

import ch06.filterAndMap.Person
import kotlin.collections.groupBy

fun main() {
    val people = listOf(
        Person("Alice", 26),
        Person("Bob", 29),
        Person("Carol", 31)
    )
    println(people.groupBy { it.age })
    // {26=[Person(name=Alice, age=26)], 29=[Person(name=Bob, age=29)], 31=[Person(name=Carol, age=31)]}

    val list = listOf("apple", "apricot", "banana", "cantaloupe")
    println(list.groupBy(String::first))
    // {a=[apple, apricot], b=[banana], c=[cantaloupe]}
}