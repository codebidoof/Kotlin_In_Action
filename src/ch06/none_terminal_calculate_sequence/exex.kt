package ch06.none_terminal_calculate_sequence

fun main() {
    println(
        listOf(1, 2, 3, 4)
            .asSequence()
            .map {
                print("map($it) ")
                it*it
            }.filter {
                print("filter($it) ")
                it % 2 == 0
            }.toList()
    )
    // map(1) filter(1) map(2) filter(4) map(3) filter(9) map(4) filter(16) [4, 16]
}