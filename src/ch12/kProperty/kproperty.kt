package ch12.kProperty

var counter = 0

fun main() {
    val kProperty = ::counter //kProperty는 KMutableProperty0<Int> 타입의 counter에 대한 참조다.
    kProperty.setter.call(21) //리플렉션 기능을 통해 세터를 호출하면서 21을 인자로 넘긴다.
    println(kProperty.get()) //get을 호출해 프로퍼티 값을 가져온다.
    // 21
}