package ch11.ex11_9_defineFilterIsInstance

inline fun <reified T> //reified 키워드는 이 타입 파라미터가 실행 시점에
        Iterable<T>.filterIsInstance(): List<T> {
    val destination = mutableListOf<T>()

    for (element in this) {
        if (element is T) { // 각 원소가 타입 인자로 지정한 클래스의 인스턴스인지 검사할 수 있다.
            destination.add(element)
        }
    }

    return destination
}