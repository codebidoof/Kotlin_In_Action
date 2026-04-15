package ch11.starProjection

import kotlin.random.Random

fun main() {
    val list: MutableList<Any?> = mutableListOf('a', 1, "qwe")
    val chars = mutableListOf('a', 'b', 'c')
    val unknownElements: MutableList<*> = //MutableList<*>는 MutableList<Any?>와 같지 않다.
        if (Random.nextBoolean()) list else chars
    println(unknownElements.first()) // 원소를 가져와도 안전하다. first()는 Any? 타입의 원소를 반환한당
    // a
    //unknownElements.add(42) // 컴파일러는 이 메서드 호출을 금지한다.
    //
}