package ch13.ex13_7_confused

import kotlinx.html.a
import kotlinx.html.body
import kotlinx.html.img
import kotlinx.html.stream.createHTML

fun main() {
    createHTML().body {
        a {
           img {
               //href = "https://..."
           }
        }
    }
}