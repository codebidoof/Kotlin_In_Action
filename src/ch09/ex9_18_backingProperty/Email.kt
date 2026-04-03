package ch09.ex9_18_backingProperty

import ch09.ex9_19_lazyInitialization.Person

class Email {
}

fun loadEmails(person: Person): List<Email> {
    println("Loading emails for ${person.name}")
    return listOf(/* */)
}