package ch16.ex_9

import ch14.runBlockingTest.log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.random.Random
import kotlin.random.nextInt
import kotlin.time.Duration.Companion.milliseconds

class RadioStation {
    private val _messageFlow = MutableSharedFlow<Int>() // 새 가변 공유 플로우를 비공개 프로퍼티로 정의한다.
    val messageFlow = _messageFlow.asSharedFlow() // 공유 플로우에 대한 읽기 전역 뷰를 제공한다.

    fun beginBroadcasting(scope: CoroutineScope) {
        scope.launch {
            while (true) {
                delay(500.milliseconds)
                val number = Random.nextInt(0..10)
                log("Emitting $number")
                _messageFlow.emit(number) // 코루틴에서 가변 공유 플로우에 값을 배출한다.
            }
        }
    }
}

fun main() {
    runBlocking {
        RadioStation().beginBroadcasting(this)
    }
}
//0 [main] Emitting 4
//502 [main] Emitting 1
//1002 [main] Emitting 2
//1502 [main] Emitting 9
//2004 [main] Emitting 10