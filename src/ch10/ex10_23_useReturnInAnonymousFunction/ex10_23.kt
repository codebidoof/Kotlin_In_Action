package ch10.ex10_23_useReturnInAnonymousFunction

import ch10.ex10_19_useReturnInGeneralLoop.Person
import ch10.ex10_19_useReturnInGeneralLoop.people

fun lookForAlice(people: List<Person>) {
    people.forEach (fun (person) { //람다식 대신 익명 함수를 사용한다
        if (person.name == "Alice") return // return은 가장 가까운 함수를 가리키는데, 이 위치에서 가장 가까운 함수는 익명 함수다.
        println("${person.name} is not Alice")
    })
}

fun main() {
    lookForAlice(people)
    // Bob is not Alice
}