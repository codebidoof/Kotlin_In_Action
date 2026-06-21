package ch14.ex14_6

import kotlinx.coroutines.delay
import kotlin.time.Duration.Companion.milliseconds

suspend fun doSomethingSlowly() {
    delay(500.milliseconds) // 함수를 500밀리초 동안 일시 중단시킨다.
    println("I'm done")
}

//fun main() = runBlocking {
//    doSomethingSlowly()
//}