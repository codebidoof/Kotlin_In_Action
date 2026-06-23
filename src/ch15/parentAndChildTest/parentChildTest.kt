package ch15.parentAndChildTest

import ch14.runBlockingTest.log
import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.Job
import kotlinx.coroutines.job
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    log("A's job: ${coroutineContext.job}")
    launch(CoroutineName("B")) {
        log("B's job: ${coroutineContext.job}")
        log("B's parent: ${coroutineContext.job.parent}")
    }
    log("A's children: ${coroutineContext.job.children.toList()}")
}
//0 [main] A's job: BlockingCoroutine{Active}@449b2d27
//15 [main] A's children: [StandaloneCoroutine{Active}@2aafb23c]
//17 [main] B's job: StandaloneCoroutine{Active}@2aafb23c
//17 [main] B's parent: BlockingCoroutine{Completing}@449b2d27
