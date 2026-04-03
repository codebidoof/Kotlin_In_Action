package ch09.ex9_17_personDestruction

import java.lang.reflect.Type

data class Person(
    val firstName: String,
    val lastName: String,
    val age: Int,
    val city: String,
)

fun introducePerson(p: Person) {
    val (firstName, _, age) = p
    println("This is $firstName, aged $age")
}

class Foo {
//    var p: Type by Delegate()
}