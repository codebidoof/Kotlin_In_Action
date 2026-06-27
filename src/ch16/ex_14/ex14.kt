package ch16.ex_14

import ch16.ex_13.ViewCounter
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    val vc = ViewCounter()

    runBlocking(Dispatchers.Default) {
        repeat(10_000) {
            launch { vc.increment() }
        }
     }
    println(vc.counter.value)
}
//5116