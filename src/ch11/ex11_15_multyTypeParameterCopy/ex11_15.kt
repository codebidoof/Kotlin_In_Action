package ch11.ex11_15_multyTypeParameterCopy

fun <T: R, R> copyData(source: MutableList<T>, // 원본의 원소 타입은 대상 원소 타입의 하위 타입이어야 한다.
                       destination: MutableList<R>) {
    for (item in source) {
        destination.add(item)
    }
}

fun main() {
    val ints = mutableListOf(1, 2, 3)
    val anyItems = mutableListOf<Any>()
    copyData(ints, anyItems) //Int가 Any의 하위 타입이기 때문에 이 함수를 호출할 수 있다.
    println(anyItems)
    // [1, 2, 3]
}

