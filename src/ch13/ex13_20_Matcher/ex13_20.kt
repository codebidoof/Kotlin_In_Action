package ch13.ex13_20_Matcher

interface Matcher<T> {
    fun test(value: T)
}

fun startsWith(prefix: String): Matcher<String> {
    return object : Matcher<String> {
        override fun test(value: String) {
            if (!value.startsWith(prefix)) {
                throw AssertionError("value $value does not start with $prefix")
            }
        }
    }
}