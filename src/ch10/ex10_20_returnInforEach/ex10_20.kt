package ch10.ex10_20_returnInforEach

import ch10.ex10_19_useReturnInGeneralLoop.Person

fun lookForAlice(people: List<Person>) {
    people.forEach {
        if (it.name == "Alice") {
            println("Found!")
            return //lookForAlice 함수에서 반환된다.
        }
    }
    println("Alice is not found")
}