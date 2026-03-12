package ch04.ex4_11_AbstractClassDefinition

abstract class Animated {
    abstract val animationSpeed: Double //추상 프로퍼티. 하위 클래스가 반드시 값이나 접근자를 제공해야 함

    //추상 프로퍼티가 아닌 프로퍼티는 초기화 필요
    val keyframes: Int = 20
    open val frames: Int = 60

    abstract fun animate() //추상 함수. 하위 클래스는 반드시 오버라이드해야함

    //추상 함수가 아닌 함수는 기본적으로 열려있지 않다. 하지만 open으로 지정할 수도 있다.
    open fun stopAnimation() { /* ... */}
    fun animateTwice() {/* ... */}
}