package ch11.ex11_12_invariantClassLooksLikeCollection

import ch11.ex11_11_invariantClass.Animal
import ch11.ex11_11_invariantClass.Herd

class Cat : Animal() { //Cat은 Animal이다
    fun clearLitter() { /* ... */ }
}

fun takeCareOfCat(cats: Herd<Cat>) {
    for (i in 0 ..<cats.size) {
        cats[i].clearLitter()
    }
    // feedAll(cats) //
}