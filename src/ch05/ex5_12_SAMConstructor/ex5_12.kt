package ch05.ex5_12_SAMConstructor

fun createAllDoneRunnable(): Runnable {
    return Runnable { println("All done!") } //SAM 생성자
}

fun main() {
    createAllDoneRunnable().run()
    // All done!
}