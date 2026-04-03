package ch09.ex9_8_compareToConvention

class Person(
    val firstName: String, val lastName: String,
): Comparable<Person> {
    override fun compareTo(other: Person): Int {
        // lastName으로 먼저 비교, 같으면 firstName으로 비교
        return compareValuesBy(this, other, Person::lastName, Person::firstName)
    }

}

fun main() {
    val p1 = Person("Alice", "Smith")
    val p2 = Person("Bob", "Johnson")

    println(p1 < p2)
    //false
}