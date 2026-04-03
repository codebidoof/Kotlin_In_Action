package ch09.ex9_5

import ch09.ex9_1_implementPlus.Point

operator fun Point.unaryMinus() : Point {
    return Point(-x, -y)
}

fun main() {
    val p = Point(10, 20)
    println(-p)
    // Point(x=-10, y=-20)
}