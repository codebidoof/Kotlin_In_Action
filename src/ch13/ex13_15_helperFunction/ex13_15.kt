package ch13.ex13_15_helperFunction

import kotlinx.html.BODY
import kotlinx.html.HtmlTagMarker
import kotlinx.html.a
import kotlinx.html.body
import kotlinx.html.h2
import kotlinx.html.id
import kotlinx.html.li
import kotlinx.html.p
import kotlinx.html.stream.createHTML
import kotlinx.html.ul

fun buildBookList() = createHTML().body {
    listWithToc {
        item("The Three-Body Problem", "The first book tackles...")
        item("The Dark Forest", "The second book starts with...")
        item("Death's End", "The third book contains...")
    }
}

@HtmlTagMarker
class LISTWITHTOC {
    val entries = mutableListOf<Pair<String, String>>()
    fun item(headline: String, body: String) {
        entries += headline to body
    }
}

/**
 * 목차(TOC)와 본문 리스트를 생성하는 함수.
 *
 * 전달받은 DSL 블록을 통해 항목(제목, 내용)을 정의하면,
 * 다음과 같은 구조의 HTML을 생성한다:
 *
 * - 상단: 각 항목으로 이동할 수 있는 링크 목록 (ul, li, a)
 * - 하단: 각 항목의 제목(h2)과 내용(p)
 *
 * @param block 항목 리스트를 구성하는 DSL 블록 (제목과 내용 쌍을 추가)
 */
fun BODY.listWithToc(block: LISTWITHTOC.() -> Unit) {
    val listWithToc = LISTWITHTOC()
    listWithToc.block()
    ul {
        for ((index, entry) in listWithToc.entries.withIndex()) {
            li { a("#index") { +entry.first } }
        }
    }
    for ((index, entry) in listWithToc.entries.withIndex()) {
        h2 { id = "$index"; +entry.first }
        p { +entry.second }
    }
}