package ch12.kCallable

//interface KCallable<out R> {
//    fun call(vararg args: Any?): R
//    // ...
//}

fun foo(x: Int) = println(x)

fun main() {
    val kFunction = ::foo //foo에 대한 KFunction1<Int, Unit> 타입의 참조를 얻는다.
    kFunction.call(42) //42를 인자로 함수를 호출한다.
    // 42
}