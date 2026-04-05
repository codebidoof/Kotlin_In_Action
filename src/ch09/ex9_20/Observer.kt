package ch09.ex9_20

fun interface Observer {
    fun onChange(name: String, oldValue: Any?, newValue: Any?)
}

// Observer들의 리스트를 관리하는 클래스
open class Observable {
    val observers = mutableListOf<Observer>()
    fun notifyObserver(propName: String, oldValue: Any?, newValue: Any?) {
        for (observer in observers) {
            observer.onChange(propName, oldValue, newValue)
        }
    }
}