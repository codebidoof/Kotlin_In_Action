package ch05.ex5_11_AccessingLocalVariableInsideLambda

import ch04.ex4_21_AccessingABackingFieldFromAGetterOrSetter1.Person
import ch04.ex4_37_EventListenerWithObject.Button

fun printProblemCounts(responses: Collection<String>) {
    var clientErrors = 0
    var serverErrors = 0
    responses.forEach {
        if (it.startsWith("4")) {
            clientErrors++
        } else if (it.startsWith("5")) {
            serverErrors++
        }
    }

    println("$clientErrors client errors, $serverErrors server errors")
}

fun main() {
    val responses = listOf<String>("200 OK", "418 I'm a teapot", "500 Internal Server Error")

    printProblemCounts(responses)
    // 1 client errors, 1 server errors
}
//
//fun tryToCountButtonClicks(button: Button) {
//    var clicks = 0
//    button.onClick{clicks++}
//    return clicks
//}

val action = { person: Person, message: String ->
    sendEmail(person, message)
}

val nextaction = ::sendEmail

fun sendEmail(person: Person, message: String) {}
