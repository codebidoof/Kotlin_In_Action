package ch15.ex15_3

import ch14.runBlockingTest.log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

fun main() = runBlocking {
    GlobalScope.launch { // 일반적으로 GlobalScope를 평범한 애플리케이션 코드에 사용하는 것은 나쁜 생각이다.
        delay(1000.milliseconds)
        launch {
            delay(250.milliseconds)
            log("Grandchild done")
        }
        log("Child 1 done!")
    }
    GlobalScope.launch {
        delay(500.milliseconds)
        log("Child 2 done!")
    }
    log("Parent done!")
}
//0 [main] Parent done!