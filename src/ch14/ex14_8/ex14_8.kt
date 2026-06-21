package ch14.ex14_8

import ch14.runBlockingTest.log
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

fun main() {
    runBlocking {
        log("Doing some work")
        launch(Dispatchers.Default) {
            log("Doing some background work")
        }
    }
}
//0 [main] Doing some work
//12 [DefaultDispatcher-worker-1] Doing some background work