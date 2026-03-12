package ch04.ex4_38_LocalVariableInObject

import ch04.ex4_37_EventListenerWithObject.Button
import ch04.ex4_37_EventListenerWithObject.MouseListener

fun main(args: Array<String>) {
    var clickCount = 0

    Button(object: MouseListener {
        override fun onEnter() {
            TODO("Not yet implemented")
        }

        override fun onClick() {
            clickCount++
        }

    })
}