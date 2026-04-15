package ch11.unsafeTypeAlias

typealias ValidatedInput = String

fun save(v: ValidatedInput): Unit = TODO()

fun main() {
    val rawInput = "needs validating!"
    save(rawInput) // 타입 별명은 컴파일 시점에 아무것도 추가로 보장해주지 않는다
}