package ch13.ex13_3_storingALambdaWithAReceiverInAVariable

import ch13.ex13_2_anotherBuildString.buildString

val appendExcl: StringBuilder.()->Unit = // appendExcl은 "확장 함수 타입"의 값이당
    {this.append("!")}

fun main() {
    val stringBuilder = StringBuilder("Hi")
    stringBuilder.appendExcl() // appendExcl을 확장 함수처럼 호출할 수 있다.
    println(stringBuilder)
    // Hi!
    println(buildString(appendExcl))
    // !
}