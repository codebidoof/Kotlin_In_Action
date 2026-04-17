package ch06.ex6_1_makeNaturalNumberSequenceAndApply

fun main() {
    val naturalNumbers = generateSequence(0) { it + 1 }
    val numbersTo100 = naturalNumbers.takeWhile { it <= 100 }
    println(numbersTo100.sum()) //sum의 결과를 계산할 때 모든 지연 계산이 수행된다.
    // 5050
}