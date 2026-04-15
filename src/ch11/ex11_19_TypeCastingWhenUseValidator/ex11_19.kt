package ch11.ex11_19_TypeCastingWhenUseValidator

import ch11.ex11_18_fieldValidator.DefaultIntValidator
import ch11.ex11_18_fieldValidator.DefaultStringValidator
import ch11.ex11_18_fieldValidator.FieldValidator
import kotlin.reflect.KClass

fun main() {
    val validators = mutableMapOf<KClass<*>, FieldValidator<*>>()
    validators[String::class] = DefaultStringValidator
    validators[Int::class] = DefaultIntValidator

    val stringValidator = validators[String::class] as FieldValidator<String> //Warning: unchecked cast
    println(stringValidator.validate(""))
    // false
}