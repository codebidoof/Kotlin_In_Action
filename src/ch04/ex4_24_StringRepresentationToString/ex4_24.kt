package ch04.ex4_24_StringRepresentationToString

class Customer(val name: String, val postalCode: Int) {
    override fun toString() = "Customer(name=$name, postalCode=$postalCode)"
}

fun main(args: Array<String>) {
    val customer1 = Customer("Alice", 342562)
    val customer2 = Customer("Alice", 342562)
    println(customer1)
    // Customer(name=Alice, postalCode=342562)
    println(customer1==customer2)
    //false
}