package ch10.ex10_18_useLinesFunction

import kotlin.io.path.Path
import kotlin.io.path.useLines

fun readFirstLineFromFile(fileName: String): String {
    Path(fileName).useLines {
        return it.first() // it은 입력 파일의 각 줄이 들어있는 문자열의 리스트다.
    }
}