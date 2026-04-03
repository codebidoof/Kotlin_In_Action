package ch09.ex9_1_implementPlus

import ch09.ex9_2_implementPlusOperator.plus

data class Point(val x: Int, val y: Int) {
    //operator fun plus(other: Point) = Point(x + other.x, y + other.y)
}

fun main() {
    val p1 = Point(10, 20)
    val p2 = Point(30, 40)
    println(p1 + p2)
    // Point(x=40, y=60)
}
