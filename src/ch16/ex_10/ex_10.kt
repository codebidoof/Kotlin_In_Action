package ch16.ex_10

import ch14.runBlockingTest.log
import ch16.ex_9.RadioStation
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

fun main(): Unit = runBlocking {
    val radioStation = RadioStation()

    radioStation.beginBroadcasting(this)

    delay(600.milliseconds)

    radioStation.messageFlow.collect {
        log("A collecting $it!")
    }
}
//