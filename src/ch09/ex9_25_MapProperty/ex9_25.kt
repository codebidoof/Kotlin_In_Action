package ch09.ex9_25_MapProperty

class Person {
    private val _attributes = mutableMapOf<String, String>()

    fun setAttribute(attrName: String, value: String) {
        _attributes[attrName] = value
    }

    var name: String
        get() = _attributes["name"]!! // 맵에서 속성을 꺼낸다.
        set(value) {
            _attributes["name"] = value //// 맵에 속성을 제공한다.
        }
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