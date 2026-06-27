package ch16.ex_7

import ch14.runBlockingTest.log
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking
import kotlin.random.Random
import kotlin.time.Duration.Companion.milliseconds

suspend fun getRandomNumber(): Int {
    delay(500.milliseconds)
    return Random.nextInt()
}

var randomNumbers = flow<Int> {
    repeat(10) {
        emit(getRandomNumber())
    }
}

fun main() = runBlocking {
    randomNumbers.collect {
        log(it)
    }
}
//0 [main] -426710691
//501 [main] -1045382093
//1003 [main] 276984504
//1504 [main] 440565720
//2005 [main] 1649132183
//2507 [main] 996520053
//3007 [main] -1428802501
//3508 [main] 851065544
//4010 [main] -773240358
//4511 [main] 465108613