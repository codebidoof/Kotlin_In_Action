package ch08.ex8_14_arrayExt

fun main(args: Array<String>) {
    args.forEachIndexed { index, element ->
        println("Argument $index is $element")
    }
}