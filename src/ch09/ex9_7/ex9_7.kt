package ch09.ex9_7

class Point(val x: Int, val y: Int) {
    override fun equals(obj: Any?): Boolean {
        if (obj === this) { return true }
        if (obj !is Point) { return false }
        return obj.x == x && obj.y == y
    }
}

data class Point2(val x: Int, val y: Int)

val a = Point2(10, 20)
val b = Point2(10, 20)

fun main() {
    println(Point(10, 20) == Point(10, 20))
    // true
    println(Point(10, 20) == Point(5, 5))
    // false
    println(null==Point(1, 2))
    // false
    println(a==b)
    //true
}

