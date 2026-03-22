package ch07.ex7_3_manySafeCall

class Address(val streetAddress: String, val zipCode: Int,
    val city: String, val country: String)

class Company(val name: String, val address: Address?)

class Person(val name: String, val company: Company?)

fun Person.countryName(): String {
//    val country = this.company?.address?.country
//    return country ?: "Unknown"
    return company?.address?.country ?: ""
}

fun main() {
    val person = Person("Dmitry", null)
    println(person.countryName())
    // Unknown
}