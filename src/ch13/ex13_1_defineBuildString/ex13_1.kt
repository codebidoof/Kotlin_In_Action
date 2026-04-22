package ch13.ex13_1_defineBuildString

fun buildString(
    builderAction: (StringBuilder) -> Unit // 함수 타입인 파라미터를 정한다.
): String {
    val sb = StringBuilder()
    builderAction(sb) // 람다 인자로 StringBuilder 인스턴스를 넘긴다
    return sb.toString()
}

fun main() {
    val s = buildString {
        it.append("Hello, ") // it은 StringBuilder인스턴스를 가리킨다
        it.append("World!")
    }
    println(s)
    // Hello, World!
}