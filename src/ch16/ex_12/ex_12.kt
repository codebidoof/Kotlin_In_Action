package ch16.ex_12

import ch14.runBlockingTest.log
import ch16.ex_11.celsiusToFahrenheit
import ch16.ex_11.getTemperatures
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.shareIn
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    val temps = getTemperatures()
    runBlocking {
        val sharedTemps = temps.shareIn(this, SharingStarted.Lazily)
        launch {
            sharedTemps.collect {
                log("$it Celsius")
            }
        }
        launch {
            sharedTemps.collect {
                log("${celsiusToFahrenheit(it)} Fahrenheit")
            }
        }
    }
}
//0 [main] 18 Celsius
//2 [main] 64.4 Fahrenheit
//488 [main] 9 Celsius
//488 [main] 48.2 Fahrenheit