package ch11.ex11_10_checkIfItIsASubtype

fun test(i: Int) {
    val n: Number = i // Int가 Number의 하위 타입이어서 컴파일된다

    fun f(s: String) { /* ... */ }
    //f(i) // Int가 String의 하위 타입이 아니어서 컴파일되지 않는다
}