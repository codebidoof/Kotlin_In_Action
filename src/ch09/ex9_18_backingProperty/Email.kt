package ch09.ex9_18_backingProperty

//import ch09.ex9_19_lazyInitialization.Person
import javax.lang.model.type.TypeKind
import kotlin.reflect.KProperty

//class Email { /* ... */}
//
//fun loadEmails(person: Person): List<Email> {
//    println("Loading emails for ${person.name}")
//    return listOf(/* */)
//}
//
//class Delegate {
//    operator fun getValue(/* ... */) { /* ... */ } // 게터를 구현하는 로직을 담는다
//    operator fun setValue(/* ... */) { /* ... */ } // 세터를 구현하는 로직을 담는다
//    operator fun provideDelegate(/* ... */>) : Delegate { /* ... */ } //위임 객체를 생성하거나 제공하는 로직을 담는다
//}
//
//class Foo {
//    var p: Type by Delegate() // by 키워드는 프로퍼티와 위임 객체를 연결한다(여기서는 Delegate의 새 인스턴스를 프로퍼티와 연결)
//}
//
//fun main() {
//    val foo = Foo() // 위임 프로퍼티가 있는 타입의 객체를 생성. 위임 객체에 provideDelegate가 있으면 그 함수를 호출해 위임 객체를 생성
//    val oldValue = foo.p //foo.p라는 프로퍼티에 접근하면 내부에서 delegate.getValue(...)를 호출한다
//    foo.p = newValue //프로퍼티 값을 변경하는 문장은 내부에서 delegate.setValue(..., newValue)를 호출한다.
//}