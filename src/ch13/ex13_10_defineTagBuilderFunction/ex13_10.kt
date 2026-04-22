package ch13.ex13_10_defineTagBuilderFunction

import kotlinx.html.TR

val children = mutableListOf<TR>()

fun tr(init: TR.()->Unit) {
//    val tr = TR()
//    tr.init()
//    children.add(tr) // children: 현재 객체(this)의 자식 TR들을 모아놓은 리스트
}