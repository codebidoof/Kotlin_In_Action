package ch07.ex7_7_notNullAssrtion

fun ignoreNulls(str: String?) {
    val strNotNull: String = str!! //예외는 이 지점을 가리킨다.
    println(strNotNull.length)
}

fun main() {
    ignoreNulls(null)
    // Exception in thread "main" java.lang.NullPointerException
}