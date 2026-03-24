package ch07.ex7_13_typeT

fun <T> printHashCode(t: T){
    println(t?.hashCode())
}

fun main() {
    printHashCode(null)
    // null
}