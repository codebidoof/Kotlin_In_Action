package ch14.coroutineContextEx

import ch14.runBlockingTest.log
import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlin.coroutines.coroutineContext

suspend fun introspect() {
    log(coroutineContext)
}

fun main() {
    runBlocking(Dispatchers.IO + CoroutineName("Coolroutine")) {
        introspect()
    }
}
// 0 [DefaultDispatcher-worker-1] [CoroutineName(Coolroutine), BlockingCoroutine{Active}@7660752, Dispatchers.IO]