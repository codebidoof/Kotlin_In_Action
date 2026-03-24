package ch07.ex7_19_overrideJavaMethodwithNullablePossibility

class StringPrinter: StringProcessor {
    override fun process(value: String) {
        println(value)
    }
}

class NullableStringPrinter: StringProcessor {
    override fun process(value: String?) {
        value?.let {println(it)}
    }
}