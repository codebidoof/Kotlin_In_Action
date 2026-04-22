package ch13.ex13_6_specifyReceiverObject

import kotlinx.html.stream.createHTML
import kotlinx.html.table
import kotlinx.html.td
import kotlinx.html.tr

fun createSimpleTable() = createHTML().table {
    this@table.tr { // this@table의 타입은 TABLE이다
        (this@tr).td { // this@tr의 갑은 TR이다
            +"cell" // 이 본문에서는 암시적 수신 객체로 this@td를 사용할 수 있고 그 타입은 TD다.
        }
    }
}