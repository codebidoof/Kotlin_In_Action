package ch13.ex13_11_simpleHTMLBuilder

import ch13.ex13_8_makeStringHTML.createTable
import kotlin.apply

//import kotlinx.html.TR

@DslMarker
annotation class HtmlTagMarker

@HtmlTagMarker
open class Tag(val name: String) {
    private val children = mutableListOf<Tag>() // 모든 내포 태그를 저장

    protected fun <T: Tag> doInit(child: T, init: T.() -> Unit) {
        child.init() // 자식 태그를 초기화
        children.add(child)
    }

    override fun toString(): String =
        "<$name>#${children.joinToString(" ")}</$name>"
}

fun table(init: TABLE.() -> Unit) = TABLE().apply(init)

class TABLE: Tag("table") {
    fun tr(init: TR.()->Unit) = doInit(TR(), init) // TR태그 인스턴스를 새로 만들고 초기화한 다음에 TABLE태그의 자식으로 등록한다.
}

class TR: Tag("tr") {
    fun td(init: TR.()->Unit) = doInit(TR(), init) // TD 태그 인스턴스를 새로 만들고 초기화한 다음에 TR태그의 자식으로 등록한다.
}

class TD: Tag("td")

fun createTable() =
    table {
        tr {
            td {

            }
        }
    }

fun main() {
    println(createTable())
}