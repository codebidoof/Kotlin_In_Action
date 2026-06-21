package ch14.ex14_9

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        launch(Dispatchers.Default) {
            var x = 0
            repeat(10_000) {
                x++
            }
            println(x)
        }
    }
}
// 10000