package ch09.ex9_2_implementPlusOperator

import ch09.ex9_1_implementPlus.Point

operator fun Point.plus(other:Point) = Point(x + other.x, y + other.y)

