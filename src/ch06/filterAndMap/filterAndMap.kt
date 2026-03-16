package ch06.filterAndMap

import kotlin.collections.map

data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4)
//    println(list.filter { it % 2 == 0 })
    // [2, 4]

    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    println(people.filter{it.age >= 30})
    // [Person(name=Bob, age=31)]

    println(list.map{it*it})
    // [1, 4, 9, 16]

    println(people.map { it.name })
    // [Alice, Bob]

    println(people.filter { it.age >= 30 }.map(Person::name))
    // [Bob]

    people.filter {
        val oldestPerson = people.maxByOrNull(Person::age)
        it.age == oldestPerson?.age
    }

    val maxAge = people.maxByOrNull(Person::age)?.age //null이 아니라면 그 Person의 age를 꺼냄
    println(people.filter { it.age == maxAge })
    // [Person(name=Bob, age=31)]
}