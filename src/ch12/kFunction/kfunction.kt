package ch12.kFunction

import kotlin.reflect.KFunction2

fun sum(x: Int, y: Int) = x + y

fun main() {
    val kFunction: KFunction2<Int, Int, Int> = ::sum
    println(kFunction.invoke(1, 2) + kFunction(3, 4))
    // 10
    //kFunction(1)
    // Kotlin: No value passed for parameter 'p2'.
}