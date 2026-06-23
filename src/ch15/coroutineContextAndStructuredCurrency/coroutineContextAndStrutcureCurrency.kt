package ch15.coroutineContextAndStructuredCurrency

import ch14.runBlockingTest.log
import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking(Dispatchers.Default) {
        log(coroutineContext)
        launch {
            log(coroutineContext)
            launch(Dispatchers.IO + CoroutineName("mine")) {
                log(coroutineContext)
            }
        }
    }
}
//0 [DefaultDispatcher-worker-1] [BlockingCoroutine{Active}@dd22e04, Dispatchers.Default]
//6 [DefaultDispatcher-worker-2] [StandaloneCoroutine{Active}@28e6abad, Dispatchers.Default]
//9 [DefaultDispatcher-worker-2] [CoroutineName(mine), StandaloneCoroutine{Active}@4e19415f, Dispatchers.IO]