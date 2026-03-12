package ch04.ex4_20_AccessingABackingFieldFromAGetterOrSetter

class User(val name: String) {
    var address: String = "unspecified"
        set(value: String) {
            println(
                """
                    Address was changed for $name:
                    "$field" -> $value".
                """.trimIndent()
            )
            field = value
        }
}

fun main() {
    val user = User("Alice")
    user.address = "Christoph-Rapparini-Bogen 23, 80639 Muenchen"
    //Address was changed for Alice:
    //"unspecified" -> Christoph-Rapparini-Bogen 23, 80639 Muenchen".

}