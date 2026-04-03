package myLab

fun main() {
    val mutableList = mutableListOf(1, 2, 3)

    // 읽기 전용 타입으로 참조 (업캐스팅)
    val readOnlyList: List<Int> = mutableList
    mutableList.add(4)

    println(readOnlyList)
    // [1, 2, 3, 4]

    //readOnlyList.add(4)
    // Kotlin: Unresolved reference 'add'.
}