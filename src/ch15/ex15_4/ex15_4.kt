package ch15.ex15_4

import ch14.runBlockingTest.log
import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

fun main() = runBlocking {
    val job = launch {
        launch {
            launch {
                launch { // 이 코루틴은 취소된 잡의 고손자이다.
                    log("I'm started")
                    delay(500.milliseconds)
                    log("I'm done!")
                }
            }
        }
    }
    delay(200.milliseconds)
    job.cancel()
}
// 0 [main] I'm started