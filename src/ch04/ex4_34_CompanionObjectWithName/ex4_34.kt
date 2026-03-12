package ch04.ex4_34_CompanionObjectWithName

class Person(val name: String) {
    companion object Loader { //Loader라는 이름의 동반 객체 생성
        fun fromJSON(jsonText: String): Person {
            val name = jsonText
                .substringAfter(":")
                .substringAfter("\"")
                .substringBefore("\"")

            return Person(name)
        }
    }
}

fun main(args: Array<String>) {
    val person = Person.Loader.fromJSON("""{"name": "Dmitry"}""")
    println(person.name)
    //
    val person2 = Person.Loader.fromJSON("""{"name": "Brent"}""")
    println(person2.name)
    //
}

