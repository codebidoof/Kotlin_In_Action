package myLab

import java.nio.charset.Charset

data class UsdCent(val amount: Int)

fun addExpense(expense: UsdCent) {
    // 비용을 미국 달러의 센트 단위로 저장
}

fun foo() {
    println("직접타이핑: 안녕하세요")
    println("Default CharSet: ${Charset.defaultCharset()}")
    println("file encoding: ${System.getProperty("file.encoding")}")
    println("sun.jnu.encoding: ${System.getProperty("sun.jnu.encoding")}")
}

fun main() {
    foo()
}