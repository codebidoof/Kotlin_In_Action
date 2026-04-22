package ch13.ex13_16_invokeMethod

/**
 * @param greeting 인삿말 ex) hello, hi
 */
class Greeter(val greeting: String) {
    operator fun invoke(name: String) {
        println("$greeting, $name!")
    }
}

fun main() {
    val bavarianGreeter = Greeter("Servus")
    bavarianGreeter("Dimitry") // Gretter인스턴스를 함수처럼 호출한당
    // Servus, Dimitry!
}