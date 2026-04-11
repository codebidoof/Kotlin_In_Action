package ch10.ex10_22_useFunctionNameForReturnLabel

import ch10.ex10_19_useReturnInGeneralLoop.Person

fun lookForAlice(people: List<Person>) {
    people.forEach {
        if (it.name != "Alice") return@forEach
        print("Found Alice!")
    }
}

fun main() {
    println(StringBuilder().apply sb@{
        listOf(1, 2, 3).apply {
            this@sb.append(this.toString())
        }
    })
    // [1, 2, 3]
}