package ch05.ex5_15_checkCondition

import ch05.ex5_14_SAMWithOneAbtractFunction.IntCondition

fun checkCondition(i: Int, condition: IntCondition): Boolean {
    return condition.check(i)
}

fun main() {
    checkCondition(1) { it % 2 == 0 } //람다를 직접 사용하거나...
    // true
    val isOdd: (Int) -> Boolean = { it % 2 != 0 }
    checkCondition(1, isOdd) // ..시그니처가 일치하는 람다에 대한 참조(isOdd)를 사용할 수 있다.
    // true
}