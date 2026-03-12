package ch04.ex4_37_EventListenerWithObject

interface MouseListener {
    fun onEnter()
    fun onClick()
}

class Button(private val listener: MouseListener) {

}

val listener = object : MouseListener {
    override fun onEnter() {
        TODO("Not yet implemented")
    }

    override fun onClick() {
        TODO("Not yet implemented")
    }

}

fun main() {
    Button(object : MouseListener {
        override fun onEnter() {
            TODO("Not yet implemented")
        }

        override fun onClick() {
            TODO("Not yet implemented")
        }

    })
}


