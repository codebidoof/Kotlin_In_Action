package ch04.ex4_31_ObjectDeclarations1

//내포 객체 사용
data class Person(val name: String) {
    object NameComparator : Comparator<Person> {
        override fun compare(p1: Person, p2: Person): Int =
            p1.name.compareTo(p2.name)
    }
}

class MyClass {
    companion object {
        fun callMe() {
            println("Companion object called")
        }
    }
}

fun main() {
//    val persons = listOf(Person("Bob"), Person("Alice"))
//    println(persons.sortedWith(Person.NameComparator)) //생성자 사용 불가능
    // [Person(name=Alice), Person(name=Bob)]

    MyClass.callMe()
    // Companion object called

    val myClass = MyClass()
    //println(myClass.callMe() //Kotlin: Unresolved reference 'callMe'.
}