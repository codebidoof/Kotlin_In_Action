package ch09.ex9_13_iteratorConvention

import java.time.LocalDate

operator fun ClosedRange<LocalDate>.iterator(): Iterator<LocalDate> =
    object : Iterator<LocalDate> {
        var current = start

        override fun next(): LocalDate {
            val thisDate = current
            current = thisDate.plusDays(1)
            return thisDate
        }

        override fun hasNext(): Boolean =
            current <= endInclusive
    }

fun main() {
    val newYear = LocalDate.ofYearDay(2042, 1)
    val daysOff = newYear.minusDays(1)..newYear
    for (dayOff in daysOff) { println(dayOff) }
    // 2041-12-31
    // 2042-01-01
}