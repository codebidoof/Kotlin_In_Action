package ch11.ex11_14_functionUsingNonVariantParameterType

fun <T> copyData(source: MutableList<T>, destination: MutableList<T>) {
    for (item in source) {
        destination.add(item)
    }
}