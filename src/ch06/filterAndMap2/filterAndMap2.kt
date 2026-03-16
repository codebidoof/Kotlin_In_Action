package ch06.filterAndMap2

import kotlin.collections.mapValues

fun main(args: Array<String>) {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7)
    val filtered = numbers.filterIndexed { index, element ->
        index % 2 == 0 && element > 3
    }
    println(filtered)
    // [5, 7]

    val mapped = numbers.mapIndexed { index, element ->
        index + element
    }
    println(mapped)
    // [1, 3, 5, 7, 9, 11, 13]

    val numbers2 = mapOf(0 to "zero", 1 to "one")
    println(numbers2.mapValues { it.value.uppercase() })
    // {0=ZERO, 1=ONE}
}