package ch11.ex11_11_invariantClass

open class Animal {
    fun feed() { /* ... */ }
}

class Herd<T : Animal> { // 이 타입 파라미터를 공변으로 지정하지 않는다
    val size: Int get() = TODO()
    operator fun get(i: Int): T = TODO()
}

fun feedAll(animals: Herd<Animal>) {
    for (i in 0..<animals.size) {
        animals[i].feed()
    }
}