package ch05.ex5_4_SearchWithMaxByOrNull

data class Person(val name: String, val age: Int)

fun main() {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
//    println(people.maxByOrNull(Person::age))

//    println(people.maxByOrNull { p: Person -> p.age })
//    println(people.maxByOrNull { p -> p.age })

    println(people.maxByOrNull { it.age })
    // Person(name=Bob, age=31)
}