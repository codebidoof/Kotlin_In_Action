package ch04.ex1_1_1_InterfacesInKotlin

interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable!") //디폴트 구현
}

class Button : Clickable {
    override fun click() = println("I was clicked")
}

fun main() {
    Button().click()
    // I was clicked
}