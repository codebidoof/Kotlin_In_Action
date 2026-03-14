package ch05.ex5_10_ParameterInLambda

fun printMessagesWithPrefix(messages: Collection<String>, prefix: String) {
    messages.forEach {
        println("$prefix $it") //람다 안에서 함수의 prefix 파라미터를 사용한다. 컴파일러가 String타입을 추론가능
    }
}

fun main(args: Array<String>) {
    val errors = listOf("403 Forbidden", "404 Not Found")
    printMessagesWithPrefix(messages = errors, prefix = "Error: ")
    // Error:  403 Forbidden
    // Error:  404 Not Found
}