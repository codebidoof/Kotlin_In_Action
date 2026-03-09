package ch04.main

interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable!") //디폴트 구현
}

interface Focusable {
    fun setFocus(b: Boolean) = println("I ${if (b) "got" else "lost"} focus.")
    fun showOff() = println("I'm focusable!")
}

class Button : Clickable, Focusable {
    override fun click() = println("I'm clickable!")

    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}

fun main(args: Array<String>) {
    val button = Button()
    button.showOff()
    //I'm clickable!
    //I'm focusable!

    button.setFocus(true)
    //I got focus.

    button.click()
    //I'm clickable!
}