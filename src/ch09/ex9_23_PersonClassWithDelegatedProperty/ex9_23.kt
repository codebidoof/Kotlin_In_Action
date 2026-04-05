package ch09.ex9_23_PersonClassWithDelegatedProperty

import ch09.ex9_20.Observable
import ch09.ex9_22_ObservablePropertyWithDelegateConvention.ObservableProperty

class Person(val name: String, age: Int, salary: Int): Observable() {
    var age by ObservableProperty(age, this)
    var salary by ObservableProperty(salary, this)
}