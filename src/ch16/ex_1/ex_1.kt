package ch16.ex_1

import ch14.runBlockingTest.log
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.seconds

// 전체 리스트가 만들어질 때까지 기다렸다가 완성되면 반환한다.
suspend fun createValues(): List<Int> {
    return buildList {
        add(1)
        delay(1.seconds)
        add(2)
        delay(1.seconds)
        add(3)
        delay(1.seconds)
    }
}

fun main() = runBlocking {
    val list = createValues()
    list.forEach {
        log(it) // 모든 값이 3초 후 출력된다.
    }
}
//0 [main] 1
//0 [main] 2
//0 [main] 3