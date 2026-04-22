package ch13.ex13_17_dependencyHandler

class DependencyHandler {
    fun implementation(coordinates: String) { // 일반적인 명령형 API를 정의
        println("Added dependency on $coordinates")
    }

    operator fun invoke(
        body: DependencyHandler.() -> Unit // invoke를 정의해 DSL 스타일 API를 제공한다
    ) {
        body() // this가 함수의 수신 객체가 되므로 this.body 와 같다.
    }
}

fun main() {
    val dependencies = DependencyHandler()
    dependencies.implementation("룸디비")
    // Added dependency on 룸디비

    dependencies {
        implementation("내비게이션") // this.implementation("내비게이션")
    }
    // Added dependency on 내비게이션
}