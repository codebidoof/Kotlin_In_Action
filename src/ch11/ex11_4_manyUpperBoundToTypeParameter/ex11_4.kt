package ch11.ex11_4_manyUpperBoundToTypeParameter

fun <T> ensureTrailingPeriod(seq: T)
    where T : CharSequence, T : Appendable { // 타입 파라미터 제약 목록
        if (!seq.endsWith('.')) { // CharSequence 인터페이스에 대해 정의된 메서드를 호출한다.
            seq.append('.') // Appendable 인터페이스에 대해 정의된 메서드를 호출한다
        }
    }

fun main() {
    val helloWorld = StringBuilder("Hello World")
    ensureTrailingPeriod(helloWorld)
    println(helloWorld)
    // Hello World.
}