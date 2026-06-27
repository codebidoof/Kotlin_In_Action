package ch16.ex_13

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class ViewCounter {
    private val _counter = MutableStateFlow(0) // 기본 상태 플로우의 초깃값을 0으로 설정해 생성한다.
    val counter = _counter.asStateFlow()

    fun increment() {
        //_counter.update { it + 1 }
        _counter.value++
    }
}

fun main() {
    val vc = ViewCounter()
    vc.increment()
    println(vc.counter.value)
}
// 1