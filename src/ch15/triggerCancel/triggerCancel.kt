package ch15.triggerCancel

import ch14.runBlockingTest.log
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

fun main() {
    runBlocking {
        val launchedJob = launch { // launch는 Job을 반환한다..
            log("I'm launched!")
            delay(1000.milliseconds)
            log("I'm done!")
        }
        val asyncDeferred = async { // ... 그리고 async는 Deferred를 반환한다.
            log("I'm async")
            delay(1000.milliseconds)
            log("I'm done!")
        }
        delay(200.milliseconds)
        launchedJob.cancel() // 2가지 다 취소할 수 있다.
        asyncDeferred.cancel()
    }
}
//0 [main] I'm launched!
//0 [main] I'm async