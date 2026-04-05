package ch09.ex9_20

class Person(val name: String, age: Int, salary: Int): Observable() {
    var age: Int = age
        set(newValue) {
            val oldValue = field
            field = newValue //뒷받침하는 필드에 접근할 때 field 식별자를 사용
            notifyObserver( //프로퍼티 변경을 옵저버들에게 통지
            "age", oldValue, newValue
            )
        }

    var salary: Int = salary
        set(newValue) {
            val oldValue = field
            field = newValue
            notifyObserver(
                "salary", oldValue, newValue
            )
        }
}

fun main() {
    val p = Person("Seb", 28, 1000)

    // 함수형 인터페이스에 대한 간편한 구문을 사용해 옵저버를 생성하고 이를 Person 인스턴스에 등록
    p.observers += Observer { propName, oldValue, newValue ->
        println(
            """
                Property $propName changed from $oldValue to $newValue!
            """.trimIndent()
        )
    }
    p.age = 29
    // Property age changed from 28 to 29!
    p.salary = 1500
    // Property salary changed from 1000 to 1500!
}