package ch08.ex8_1_nullablePrimitiveType

data class Person(val name: String,
                  val age: Int? = null) {
    fun isOrderThan(other: Person): Boolean? {
        if (age == null || other.age == null) {
            return null
        }
        return age > other.age
    }
}

fun main() {
    println(Person("Sam", 35).isOrderThan(Person("Amy", 42)))
    // false
    println(Person("Sam", 35).isOrderThan(Person("Jane")))
    // null
}