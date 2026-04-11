package ch10.ex10_7_functionReturnfunction

enum class Delivery { STANDARD, EXPEDITED }

class Order(val itemCount: Int)

fun getShippingCostCalculator(delivery: Delivery): (Order) -> Double { // 함수를 반환하는 함수를 선언
    if (delivery == Delivery.EXPEDITED) {
        return { order -> 6 + 2.1 * order.itemCount } //함수에서 람다를 반환한다.
    }
    return { order -> 1.2 * order.itemCount } //함수에서 람다를 반환한다.
}

fun main() {
    val calculator = getShippingCostCalculator(Delivery.EXPEDITED) // 반환받은 함수를 변수에 저장한다
    println("Shipping costs ${calculator(Order(3))}") // 반환받은 함수를 호출한다.
    // Shipping costs 12.3
}