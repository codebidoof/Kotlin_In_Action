package ch04.ex4_39_InlineClass

interface PrettyPrintable {
    fun prettyPrint()
}

@JvmInline
value class UsdCent1(val amount: Int): PrettyPrintable {
    val salesTex get() = amount * 0.06
    override fun prettyPrint() = println("${amount}센트")
}

fun main() {
    val expense = UsdCent1(1_99)
    println(expense.salesTex)
    // 11.94
    expense.prettyPrint()
    // 199센트
}