package ch11.ex11_16_outProjectionTypeParameterCopy

fun <T> copyData(source: MutableList<out T>
                 , destination: MutableList<T>) {
    for (item in source) {
        destination.add(item)
    }
}

fun main() {
    val list: MutableList<out Number> = mutableListOf() //읽기 전용으로 쓰겠다.
    //list.add(42)
    // Receiver type 'MutableList<out Number>' contains out projection which prohibits the use of 'fun add(element: E): Boolean'.
}