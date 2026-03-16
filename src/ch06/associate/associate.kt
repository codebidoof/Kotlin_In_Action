package ch06.associate

import ch06.filterAndMap.Person

fun main(args: Array<String>) {
    val people = listOf(
        Person("Joe", 22),
        Person("Mary", 31),
        Person("Jamie", 22),
        )
    val nameToAge = people.associate { it.name to it.age }
    println(nameToAge)
    // {Joe=22, Mary=31, Jamie=22}
    println(nameToAge["Joe"]) //key로 value 에 접근
    // 22

    val personToAge = people.associateWith { it.age }
    println(personToAge)
    // {Person(name=Joe, age=22)=22, Person(name=Mary, age=31)=31, Person(name=Jamie, age=22)=22}

    val ageToPerson = people.associateBy{ it.age }
    println(ageToPerson)
    // {22=Person(name=Jamie, age=22), 31=Person(name=Mary, age=31)}
    // 맵에서 키는 유일해야 한다
}