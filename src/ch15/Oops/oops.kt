package ch15.Oops

import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeoutOrNull
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.Duration.Companion.seconds

suspend fun doWork() {
    delay(500.milliseconds) // 여기서 CancellationException을 던지지만..
    throw UnsupportedOperationException("Didn't work!")
}

fun main() {
    runBlocking {
        withTimeoutOrNull(2.seconds) {
            while (true) {
                try {
                    doWork()
                } catch (e: Exception) { // ... 여기서 예외를 삼켜버려서 취소를 막는다.
                    println("Oops: ${e.message}")
                }
            }
        }
    }
}
// Oops: Didn't work!
// Oops: Didn't work!
// Oops: Didn't work!
// Oops: Timed out waiting for 2000 ms
// ... (does not terminate)