package ch13.ex13_2_anotherBuildString

fun buildString(
    buildAction: StringBuilder.() -> Unit // "수신 객체가 지정된 함수 타입의 파라미터"를 선언한다.
): String {
    val sb = StringBuilder()

    // 확장 함수처럼 보이지만, 사실은 ""
    sb.buildAction() //StringBuilder 인스턴스(sb)를 람다의 수신 객체로 넘긴다.

    return sb.toString()
}

fun main() {
    val s = buildString {
        this.append("Hello, ") //this 키워드는 StringBuilder인스턴스를 가리킨다
        append("World") //this를 생략해도 암시적으로 StringBuilder 인스턴스가 수신 객체로 취급된다.
    }
    println(s)
    // Hello, World!
}