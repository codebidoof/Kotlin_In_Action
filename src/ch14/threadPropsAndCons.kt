package ch14

import kotlin.concurrent.thread

fun main() {
    val worker = thread {
        while (true) {
            println("작업 중")
            // 새 스레드의 인터럽트 상태를 직접 확인하지 않으면
            // interrupt()가 호출되어도 계속 실행될 수 있다.
        }
    }

    Thread.sleep(3000)

    println("취소 요청")
    worker.interrupt() // 취소 요청

    println("main 종료")
}
