package ch09.ex9_3

import ch09.ex9_1_implementPlus.Point

operator fun Point.times(scale: Double): Point {
    return Point((x * scale).toInt(), (y * scale).toInt())
}

fun main() {
    val p = Point(10, 20)
    println(p*1.5)
}