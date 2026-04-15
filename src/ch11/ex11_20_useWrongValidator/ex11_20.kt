package ch11.ex11_20_useWrongValidator

import ch11.ex11_18_fieldValidator.DefaultIntValidator
import ch11.ex11_18_fieldValidator.DefaultStringValidator
import ch11.ex11_18_fieldValidator.FieldValidator
import kotlin.reflect.KClass

fun main() {
    val validators = mutableMapOf<KClass<*>, FieldValidator<*>>()
    validators[String::class] = DefaultStringValidator
    validators[Int::class] = DefaultIntValidator

    val stringValidator = validators[Int::class]
            as FieldValidator<String> // 경고만 표시하고 컴파일은 된다
    stringValidator.validate("") //검증기를 사용해야 비로소 오류가 발생한다
    // java.lang.ClassCastException:
    // class java.lang.String cannot be cast to class java.lang.Number
    // at DefaultIntValidator.validate
}