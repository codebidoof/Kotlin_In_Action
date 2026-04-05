package ch09.ex9_26_DelegateToMap

class Person {
    private val _attributes = mutableMapOf<String, String>()

    fun setAttribute(attrName: String, value: String) {
        _attributes[attrName] = value
    }

    var name: String by _attributes //위임 프로퍼티로 맵을 사용
}

fun main() {
    val p = Person()

    val data = mapOf("name" to "Seb", "company" to "JetBrains")
    for ((attrName, value) in data) {
        p.setAttribute(attrName, value) // Person 내부 속성 맵에 값 추가
    }
    println(p.name)
    // Seb
    p.name = "Sebastian"
    println(p.name)
    // Sebastian
}

