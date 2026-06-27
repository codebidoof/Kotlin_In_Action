package ch16.ex_8

import ch14.runBlockingTest.log
import ch16.ex_7.getRandomNumber
import kotlinx.coroutines.flow.channelFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

var randomNumber = channelFlow { // 새 채널 플로우를 생성한다
    repeat(10) {
        launch {
            send(getRandomNumber()) // 여러 코루틴에서 send를 호출할 수 있다.
        }
    }
}

fun main() = runBlocking {
    randomNumber.collect {
        log(it)
    }
}
//0 [main] -505069715
//1 [main] 2027604026
//1 [main] 585619388
//1 [main] 1057763311
//1 [main] 2129817706
//1 [main] 50534748
//1 [main] -1635585284
//1 [main] -665215375
//1 [main] 563440071
//1 [main] -1616873037