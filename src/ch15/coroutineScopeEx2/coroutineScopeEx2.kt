package ch15.coroutineScopeEx2

import ch14.runBlockingTest.log
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.job
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
    log("A's job: ${coroutineContext.job}")
    coroutineScope {
        log("B's parent: ${coroutineContext.job.parent}") // A
        log("B's job: ${coroutineContext.job}") // C
        launch {
            log("C's parent: ${coroutineContext.job.parent}") // B
        }
    }
}
//0 [main] A's job: BlockingCoroutine{Active}@449b2d27
//4 [main] B's parent: BlockingCoroutine{Active}@449b2d27
//4 [main] B's job: ScopeCoroutine{Active}@5c0369c4
//11 [main] C's parent: ScopeCoroutine{Completing}@5c0369c4