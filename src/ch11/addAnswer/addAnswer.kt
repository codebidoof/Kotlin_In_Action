package ch11.addAnswer

fun addAnswer(list: MutableList<Any>) {
    list.add(42)
}

fun main() {
    val strings = mutableListOf("abc", "bac")
    //addAnswer(strings) // 이 줄이 컴파일된다면
    println(strings.maxBy { it.length }) // 실행 시점에 예외가 발생할 것이다
    // ClassCastException: Integer cannot be cast to String
}