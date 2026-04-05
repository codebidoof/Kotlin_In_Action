package ch09.ex9_19_lazyInitialization

//import ch09.ex9_18_backingProperty.loadEmails
//
//class Person(val name: String) {
//    val emails by lazy { loadEmails(this) }
//}


//

/*class Person(val name: String) {

    private val emails$delegate = lazy { loadEmails(this) }

    val emails: List<String>
        get() = emails$delegate.getValue(this, ::emails)
}
*/