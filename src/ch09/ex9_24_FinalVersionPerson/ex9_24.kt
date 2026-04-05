package ch09.ex9_24_FinalVersionPerson

import ch09.ex9_20.Observable
import kotlin.properties.Delegates
import kotlin.reflect.KProperty

class Person(val name: String, age: Int, salary: Int): Observable() {

    private val onChange = { property: KProperty<*>, oldValue: Any?, newValue: Any? ->
        notifyObserver(property.name, oldValue, newValue)
    }

    var age by Delegates.observable(age, onChange)
    var salary by Delegates.observable(salary, onChange)

}