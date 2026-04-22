package ch13.ex13_8_makeStringHTML

import kotlinx.html.stream.createHTML
import kotlinx.html.table
import kotlinx.html.td
import kotlinx.html.tr

fun createTable() =
    createHTML().table {
        tr {
            td{

            }
        }
    }

fun main() {
    println(createTable())
}