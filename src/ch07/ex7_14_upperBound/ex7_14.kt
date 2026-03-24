package ch07.ex7_14_upperBound

fun <T: Any> printHashCode(t: T){
    println(t.hashCode())
}

fun main() {
//    printHashCode(null)
    // Kotlin: Null cannot be a value of a non-null type 'uninferred T (of fun <T : Any> printHashCode)'.

    printHashCode(42)
    // 42
}