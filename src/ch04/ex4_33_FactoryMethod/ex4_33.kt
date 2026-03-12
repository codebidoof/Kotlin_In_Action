package ch04.ex4_33_FactoryMethod

import ch04.ex4_19_propertyInInterface.getNameFromSocialNetwork

class User private constructor(val name: String) {
    companion object { //동반 객체
        fun newSubcrtibingUser(email: String) =
            User(email.substringBefore('@'))
        fun newSocialUser(accountId: Int) =
            User(getNameFromSocialNetwork(accountId))
    }
}

fun main(args: Array<String>) {
    val subscribingUser = User.newSubcrtibingUser("bob@gmail.com")
    val socialUser = User.newSocialUser(4)
    println(subscribingUser.name)
    // bob
}