package ch16.ex_2

import ch14.runBlockingTest.log
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

fun createValues(): Flow<Int> {
    return flow {
        emit(1) // 배출된 원소는 즉시 수집자(collect 실행)에 의해 처리된다.
        delay(1000.milliseconds)
        emit(2)
        delay(1000.milliseconds)
        emit(3)
        delay(1000.milliseconds)
    }
}

fun main() = runBlocking {
    val myFlowOfValues = createValues()
    myFlowOfValues.collect { log(it) } // 값이 배출되자마자 출력된다.
}
//0 [main] 1
//1013 [main] 2
//2013 [main] 3