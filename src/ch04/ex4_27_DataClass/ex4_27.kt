package ch04.ex4_27_DataClass

data class Customer(val name: String, val postalCode: Int) {
    //data class는 이런 식으로 copy메서드가 구현되어 있다.
//    fun copy(name: String = this.name,
//             postalCode: Int = this.postalCode) =
//        Customer(name, postalCode)
}

fun main() {
    val c1 = Customer("Sam", 11521)
    val c2 = Customer("Mart", 15500)
    val c3 = Customer("Sam", 11521)
    println(c1)
    //Customer(name=Sam, postalCode=11521)
    println(c1 == c2)
    //false
    println(c1 == c3)
    //true
    println(c1.hashCode())
    //2580770
    println(c3.hashCode())
    //2580770

    val lee = Customer("이계영", 4122)
    println(lee.copy(postalCode = 4000)) //copy메서드 : 객체를 복사하면서 일부 프로퍼티를 바꿀 수 있게 해준다
    //Customer(name=이계영, postalCode=4000)
}