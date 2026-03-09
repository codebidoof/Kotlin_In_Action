package ch04.ex1_2_1_OpenFinalAbstractModifiers

interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable!")
}

open class RichButton : Clickable {

    fun disable() {} //파이널, 오버리이드 불가

    open fun animate() {} //오버라이드 가능

    override fun click() {
        TODO("Not yet implemented")
    }

}

class ThemedButton : RichButton() {
    override fun click() {}
    override fun showOff() {}
    override fun animate() {}
}