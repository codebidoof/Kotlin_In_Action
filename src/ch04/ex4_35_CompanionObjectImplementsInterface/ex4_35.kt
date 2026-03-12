package ch04.ex4_35_CompanionObjectImplementsInterface

interface JSONFactory<T> {
    fun fromJSON(json: String): T
}

class Person(val name: String) {
    companion object: JSONFactory<Person> {
        override fun fromJSON(json: String): Person = TODO()
    }
}