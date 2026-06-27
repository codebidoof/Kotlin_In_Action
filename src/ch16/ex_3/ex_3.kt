package ch16.ex_3

import ch14.runBlockingTest.log
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import kotlin.time.Duration.Companion.milliseconds

fun main() {
    val letters = flow {
        log("Emitting A!")
        emit("A") // emit 함수를 호추해 플로우의 수집자에게 간을 제공한다.
        delay(200.milliseconds)
        log("Emitting B!")
        emit("B")
    }
}