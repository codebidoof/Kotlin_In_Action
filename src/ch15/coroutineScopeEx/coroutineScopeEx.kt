package ch15.coroutineScopeEx

import ch14.runBlockingTest.log
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.random.Random
import kotlin.time.Duration.Companion.milliseconds

suspend fun generateValue(): Int {
    delay(500.milliseconds)
    return Random.nextInt(0, 10)
}

suspend fun computeSum() { // computeSum 함수는 일시 중단 함수다
    log("Computing a sum...")
    val sum = coroutineScope { // 새로운 코루틴 스코프를 생성
        val a = async { generateValue() }
        val b = async { generateValue() }
        a.await() + b.await() // coroutineScope는 결과를 돌려주기 전에 모든 자식 코루틴이 끝나길 기다린다.
    }
    log("Sum is $sum")
}

fun main() = runBlocking {
    computeSum()
}
//0 [main] Computing a sum...
//527 [main] Sum is 6