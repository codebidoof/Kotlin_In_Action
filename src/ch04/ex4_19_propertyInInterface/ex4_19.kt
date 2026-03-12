package ch04.ex4_19_propertyInInterface

interface User {
    val nickname: String
}

class PrivateUser(override val nickname: String) : User

class SubscribingUser(val email: String) : User {
    override val nickname: String
        get() = email.substringBefore('@')
}

class SocialUser(val accountId: Int) : User {
    override val nickname = getNameFromSocialNetwork(accountId)
}

fun getNameFromSocialNetwork(accountId: Int) = "kodee$accountId"

fun main() {
    println(PrivateUser("kodee").nickname)
    // kodee
    println(SubscribingUser("test@naver.com").nickname)
    // test
    println(SocialUser(123).nickname)
    // kodee123
}


interface EmailUser {
    val email: String
    val nickname: String
        get() = email.substringBefore('@')
}