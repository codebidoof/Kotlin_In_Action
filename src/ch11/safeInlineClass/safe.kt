package ch11.safeInlineClass

@JvmInline
value class ValidatedInput (val s: String)

fun save(v: ValidatedInput): Unit = TODO()

fun main() {
    val rawInput = "needs validating!"
    //save(rawInput) // ValidatedInput와 String의 불일치 때문에 컴파일 불가
}