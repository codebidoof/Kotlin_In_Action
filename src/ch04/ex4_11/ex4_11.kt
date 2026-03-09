package ch04.ex4_11

abstract class Animated {
    abstract val animationSpeed: Double
    val keyframes: Int = 20
    open val frames: Int = 60

    abstract fun animate()
    open fun stopAnimation() { /* ... */}
    fun animateTwice() {/* ... */}
}