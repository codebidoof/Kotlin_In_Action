package ch09.ex9_22_ObservablePropertyWithDelegateConvention

import ch09.ex9_20.Observable
import kotlin.reflect.KProperty

class ObservableProperty(var propValue: Int, val observable: Observable) {
    operator fun getValue(thisRef: Any?, prop: KProperty<*>): Int = propValue
    operator fun setValue(thisRef: Any?, prop: KProperty<*>, newValue: Int) {
        val oldValue = propValue
        propValue = newValue
        observable.notifyObserver(prop.name, oldValue, newValue)
    }
}