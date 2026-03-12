package ch04.ex4_39_InlineClass


//
@JvmInline
value class UsdCent(val amount: Int)

fun addExpense(expense: UsdCent){
    // 비용을 미국 단위의 센트 단위로 저장
}

fun main(args: Array<String>) {
    //실제 컴파일: addExpense(147). 객체를 만들지 않고 값으로 치환
    addExpense(UsdCent(147))
}

