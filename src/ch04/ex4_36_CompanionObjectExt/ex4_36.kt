package ch04.ex4_36_CompanionObjectExt

//비즈니스 로직 모듈
class Person(val firstName: String, val lastName: String) {
    companion object { //비어있는 동반 객체 선언

    }
}

// 클라이언트/서버 통신 모듈
fun Person.Companion.fromJSON(json: String): Person { //확장 함수 선언
    TODO()
}

val p = Person.fromJSON("json")