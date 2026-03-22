package ch06.ex6_3_SequenceOfDirectory

import java.io.File

fun File.isInsideHiddenDirectory() =
    generateSequence(this) { it.parentFile }.any { it.isHidden }

fun main(args: Array<String>) {
    val file = File("src", "ch06.ex6_3_SequenceOfDirectory")
    println(file.isInsideHiddenDirectory())
    // false
}