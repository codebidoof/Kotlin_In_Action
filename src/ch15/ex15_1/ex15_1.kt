package ch15.ex15_1

import ch14.runBlockingTest.log
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.Duration.Companion.seconds

fun main() {
    runBlocking { // this: CoroutineScope, 암시적 수신 객체
        launch { // this: CoroutineScope, launch가 시작한 코루틴은 부모 runBlocking 코루틴의 자식이다.
            delay(1.seconds)
            launch {
                delay(250.milliseconds)
                log("Grandchild done")
            }
            log("Child 1 done!")
        }
        launch {
            delay(500.milliseconds)
            log("Chile 2 done!")
        }
        log("Parent done!")
    }
}
//0 [main] Parent done!
//514 [main] Chile 2 done!
//1013 [main] Child 1 done!
//1265 [main] Grandchild done