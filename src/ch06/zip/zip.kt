package ch06.zip

import ch06.filterAndMap.Person

fun main(args: Array<String>) {
    val names = listOf("Joe", "Mary", "Jamie")
    val ages = listOf(22, 31, 31, 44, 0)
    println(names.zip(ages))
    // [(Joe, 22), (Mary, 31), (Jamie, 31)]
    println(names.zip(ages) {name, age ->
        Person(name, age)
    })
    // [Person(name=Joe, age=22), Person(name=Mary, age=31), Person(name=Jamie, age=31)]
    println(names zip ages)
    // [(Joe, 22), (Mary, 31), (Jamie, 31)]
    val countries = listOf("DE", "NL", "US")
    println(names zip ages zip countries)
    // [((Joe, 22), DE), ((Mary, 31), NL), ((Jamie, 31), US)]
}


