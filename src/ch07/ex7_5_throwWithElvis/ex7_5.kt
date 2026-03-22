package ch07.ex7_5_throwWithElvis

import ch07.ex7_3_manySafeCall.Address
import ch07.ex7_3_manySafeCall.Company
import ch07.ex7_3_manySafeCall.Person

fun printShippingLabel(person: Person) {
    val address = person.company?.address
        ?: throw IllegalArgumentException("No address")

    with(address) {
        println(streetAddress)
        println("$zipCode $city, $country")
    }
}

fun main(args: Array<String>) {
    val address = Address("Elsestr. 47", 80687, "Munich", "Germany")
    val jetbrains = Company("JetBrains", address)
    val person = Person("Dmitry", jetbrains)

    printShippingLabel(person)
    //Elsestr. 47
    //80687 Munich, Germany

    printShippingLabel(Person("Alexey", null))
    // Exception in thread "main" java.lang.IllegalArgumentException: No address
}