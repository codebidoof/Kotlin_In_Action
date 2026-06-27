package ch16.ex_11

import ch14.runBlockingTest.log
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.random.Random
import kotlin.random.nextInt
import kotlin.time.Duration.Companion.milliseconds

fun querySensor(): Int =  Random.nextInt(-10..30)

fun getTemperatures(): Flow<Int> = flow {
    while (true) {
        emit(querySensor())
        delay(500.milliseconds)
    }
}

fun celsiusToFahrenheit(celsius: Int) =
    celsius * 9.0 / 5.0 + 32.0

fun main() {
    val temps = getTemperatures()
    runBlocking {
        // 플로우를 2번 수집하게 된다.

        launch {
            temps.collect {
                log("$it Celsius")
            }
        }
        launch {
            temps.collect {
                log("${celsiusToFahrenheit(it)} Fahrenheit")
            }
        }
    }
}