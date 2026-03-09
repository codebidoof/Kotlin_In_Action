package ch03.ex6_3_LocalFunctionsAndExtensions2

import ch03.ex6_4_LocalFunctionsAndExtensions3.User

class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User) {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                "Can't save user ${user.id}: " +
                    "empty $fieldName")
        }
    }

    validate(user.name, "Name")
    validate(user.address, "Address")


}