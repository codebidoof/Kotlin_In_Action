package ch07.ex7_10_nullableProperty

class MyService {
    fun performAction(): String = "Action Done"
}

class MyTest {
    private var myService: MyService? = null

    fun setUp() {
        myService = MyService()
    }

    fun testAction() {
        //assertEquals("Action Done", myService!!.performAction())
    }


}