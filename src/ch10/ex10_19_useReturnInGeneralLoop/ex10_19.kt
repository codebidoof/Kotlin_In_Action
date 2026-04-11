package ch10.ex10_19_useReturnInGeneralLoop

data class Person(val name: String, val age: Int)

val people = listOf(Person("Alice", 29), Person("Bob", 31))

fun lookForAlice(people: List<Person>) {
    for (person in people) {
        if (person.name == "Alice") {
            println("Found!")
            return
        }
    }
    println("Alice is not found") //people 안에 앨리스가 없으면 이 줄이 출력된다.
}

fun main() {
    lookForAlice(people)
    // Found!
}