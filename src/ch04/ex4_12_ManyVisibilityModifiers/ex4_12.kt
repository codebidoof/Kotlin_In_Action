package ch04.ex4_12_ManyVisibilityModifiers

internal open class TalkativeButton {
    private fun yell() = println("Hey!")
    protected fun whisper() = println("Let's talk!")
}

//fun TalkativeButton.giveSpeech() {
//    yell()
//
//    whisper()
//}