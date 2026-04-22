package ch13.ex13_12_createTagDynamically

import ch13.ex13_11_simpleHTMLBuilder.table

fun createAnotherTable() = table {
    for (i in 1..2) {
        tr {
            td {

            }
        }
    }
}

fun main() {
    println(createAnotherTable())
}