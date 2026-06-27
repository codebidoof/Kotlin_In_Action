package ch16.ex_5

import ch14.runBlockingTest.log
import ch16.collectorEx.letters
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

fun main() = runBlocking {
    letters.collect {
        log("(1) Collecting $it")
        delay(500.milliseconds)
    }
    letters.collect {
        log("(2) Collecting $it")
        delay(500.milliseconds)
    }
}
//0 [main] Emitting A!
//6 [main] (1) Collecting A
//721 [main] Emitting B!
//722 [main] (1) Collecting B
//1225 [main] Emitting A!
//1225 [main] (2) Collecting A
//1928 [main] Emitting B!
//1928 [main] (2) Collecting B