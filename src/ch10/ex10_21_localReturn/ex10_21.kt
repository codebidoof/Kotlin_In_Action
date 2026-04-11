package ch10.ex10_21_localReturn

import ch10.ex10_19_useReturnInGeneralLoop.Person
import ch10.ex10_19_useReturnInGeneralLoop.people

fun lookForAlice(people: List<Person>) {
    people.forEach label@{ //람다식 앞에 레이블을 붙힌다.
        if (it.name != "Alice") return@label // return@label은 앞에서 정의한 레이블을 참조한다.
        print("Found Alice!") // return이 실행되지 않은 경우에만 이 줄이 출력된다.
    }
}

fun main() {
    lookForAlice(people)
    // Found Alice!
}