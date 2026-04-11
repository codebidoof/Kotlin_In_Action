package ch10.ex10_4_hardCodingJoinToString

import java.io.File.separator

fun <T> Collection<T>.joinToString(
    seperator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator) // 기본 toString 메서드를 사용해 객체를 문자열로 변환한다.
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}