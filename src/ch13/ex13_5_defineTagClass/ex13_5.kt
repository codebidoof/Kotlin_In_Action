package ch13.ex13_5_defineTagClass

import kotlinx.html.TR

open class Tag

abstract class TABLE: Tag() {
    abstract fun tr(init: TR.() -> Unit)
}

abstract class TR: Tag() {
    abstract fun tr(init: TR.() -> Unit)
}
