package ch10.ex10_8_functionReturnFunctionInUI

data class Person(
    val name: String,
    val lastName: String,
    val phoneNumber: String?,
)

class ContactListFilters {
    var prefix: String = ""
    var onlyWithPhoneNumber: Boolean = false

    fun getPredicate(): (Person) -> Boolean { // 함수를 반환하는 함수를 정의

        // 이 사람의 이름이나 성이 prefix로 시작하면 true
        val startsWithPrefix = { p: Person ->
            p.name.startsWith(prefix) || p.lastName.startsWith(prefix)
        }

        if (!onlyWithPhoneNumber) { // 전화번호 필터 안 쓸 때
            return startsWithPrefix // 함수 타입의 변수를 반환한다.
        }
        return { startsWithPrefix(it) // 전화번호까지 필터링할 때
                && it.phoneNumber != null } // 이 함수는 람다를 반환한다.
    }
}

fun main() {
    val contasts = listOf(
        Person("Dmitry", "Jemerov", "123-4567"),
        Person("Svetlana", "Isakova", null)
    )
    val contactListFilters = ContactListFilters()
    with(contactListFilters) {
        prefix = "Dm"
        onlyWithPhoneNumber = true
    }
    println(
        contasts.filter(contactListFilters.getPredicate()) //getPredicate가 반환한 함수를 filter에 인자로 넘긴다.
    )
    // [Person(name=Dmitry, lastName=Jemerov, phoneNumber=123-4567)]
}