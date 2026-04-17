package ch12.jkid

import kotlin.reflect.full.*

class Person(val name: String, val age: Int)

fun main() {
    val person = Person("Alice", 29)
    val kClass = person::class // KClass<out Person>의 인스턴스를 반환한다.
    println(kClass.simpleName)
    // Person
    kClass.memberProperties.forEach { println(it.name) }
    // age
    // name
}