package ch15.cpuheavy

import ch14.runBlockingTest.log
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.yield
import kotlin.time.Duration.Companion.milliseconds

suspend fun doCpuHeavyWork(): Int {
    log("I'm doing work!")
    var counter = 0
    val startTime = System.currentTimeMillis()
    while (System.currentTimeMillis()  < startTime + 500) {
        counter++
        yield()
    }
    return counter
}

fun main() {
    runBlocking {
        launch {
            repeat(3) {
                doCpuHeavyWork()
            }
        }
        launch {
            repeat(3) {
                doCpuHeavyWork()
            }
        }
    }
}
//0 [main] I'm doing work!
//2 [main] I'm doing work!
//501 [main] I'm doing work!
//502 [main] I'm doing work!
//1001 [main] I'm doing work!
//1002 [main] I'm doing work!