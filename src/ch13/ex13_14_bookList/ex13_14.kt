package ch13.ex13_14_bookList

import kotlinx.html.a
import kotlinx.html.body
import kotlinx.html.h2
import kotlinx.html.id
import kotlinx.html.li
import kotlinx.html.p
import kotlinx.html.stream.createHTML
import kotlinx.html.ul

fun buildBookList() = createHTML().body {
    ul {
        li { a("#1") { +"The Three-Body Problem" } }
        li { a("#2") { +"The Dark Forest" } }
        li { a("#3") { +"Death's End" } }
    }

    h2 { id = "1"; +"The Three-Body Problem" }
    p { + "The first book tackles..." }

    h2 { id = "2"; +"The Dark Forest" }
    p { + "The second book starts with..." }

    h2 { id = "3"; +"Death's End" }
    p { + "The third book contains..." }
}