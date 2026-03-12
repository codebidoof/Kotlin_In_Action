package ch04.ex4_32_NotFactoryMethod

class User {
    val nickname: String

    constructor(email: String) { //부 생성자
        nickname = email.substringBefore('@')
    }

    constructor(socialAccountId: Int) {
        nickname = socialAccountId.toString()
    }
}