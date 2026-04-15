package ch11.ex11_2_runGenericHighOrderFunction

fun main() {
    val authors = listOf("Sveta", "Seb", "Roman", "Dima")
    val readers = mutableListOf<String>("Seb", "Hadi")
    println(readers.filter{ it !in authors})
    // [Hadi]
}