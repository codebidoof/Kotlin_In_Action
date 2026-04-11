package ch10.ex10_14_defineInlineFunction

import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock

inline fun <T> synchronized(lock: Lock, action: () -> T): T {
    lock.lock()
    try {
        return action()
    }
    finally {
        lock.unlock()
    }
}

fun foo (l: Lock) {
    println("Before sync")
    synchronized(l) {
        println("Action")
    }
    println("After sync")
}

class LockOwner(val lock: Lock) {
    fun runUnderLock(body: () -> Unit) {
        synchronized(lock, body) // 이 경우에 람다 본문은 인라이닝되지 않음. 대신 synchronized 함수의 본문만 인라이닝됨.
    }
}

//class FunctionStorage {
//    var myStoredFunction: ((Int) -> Unit)? = null
//    inline fun storeFunction(f: (Int) -> Unit) {
//        myStoredFunction = f
//    }
//}

fun main() {
    val l = ReentrantLock()
    synchronized(l) {
        // ...
    }
}