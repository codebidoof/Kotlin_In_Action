package ch10.ex10_6_nullableFunctionTypeParameter

fun <T> Collection<T>.joinToString(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = "",
    transform: ((T) -> String)? = null //함수 타입 파라미터를 선언하면서 람다를 기본값으로 지정한다.
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        val str = transform?.invoke(element) // 안전한 호출을 사용해 함수를 호출한다.
            ?: element.toString() //엘비스 연산자를 사용해 람다를 지정하지 않은 경우를 처리한다.
        result.append(str)
    }

    result.append(postfix)
    return result.toString()
}