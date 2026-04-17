package myLab

data class UsdCent(val amount: Int)

fun addExpense(expense: UsdCent) {
    // 비용을 미국 달러의 센트 단위로 저장
}

fun main() {
    addExpense(UsdCent(147))
}