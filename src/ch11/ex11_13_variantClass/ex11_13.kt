package ch11.ex11_13_variantClass

import ch11.ex11_11_invariantClass.Animal
import ch11.ex11_12_invariantClassLooksLikeCollection.Cat

class Herd<out T: Animal> { //T는 이제 공변적이다
    val size: Int get() = TODO()
    operator fun get(i: Int): T = TODO()
}

fun feedAll(animals: Herd<Animal>) {
    for (i in 0..<animals.size) {
        animals[i].feed()
    }
}

fun takeCareOfCats(cats: Herd<Cat>) {
    for (i in 0..<cats.size) {
        cats[i].clearLitter()
    }
    feedAll(cats) //캐스팅을 할 필요가 없다.
}