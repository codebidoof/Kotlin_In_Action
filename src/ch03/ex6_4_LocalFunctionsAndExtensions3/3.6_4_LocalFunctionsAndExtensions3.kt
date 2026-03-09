package ch03.ex6_4_LocalFunctionsAndExtensions3

class User(val id: Int, val name: String, val address: String)

//확장 함수로 추출
fun User.validateBeforeSave() {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                "Can't save user $id: empty $fieldName"
            )
        }
    }

    validate(this.name, "Name")
    validate(this.address, "Address")
}

fun saveUser(user: User) {
    user.validateBeforeSave()
    // user을 db에 저장
}