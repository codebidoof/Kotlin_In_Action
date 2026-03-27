package ch08.javaKotlinCollection

fun printInUppercase(list: List<String>) { //읽기 전용 파라미터 선언
    println(CollectionUtils.uppercaseAll(list)) // 컬렉션을 변경하는 자바 함수 호출
    println(list.first())
}

fun main() {
    val list = listOf("a", "b", "c")
    printInUppercase(list)
    // [A, B. C]
    // A
}