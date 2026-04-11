package ch10.ex10_17_useFunction

import java.io.BufferedReader
import java.io.FileReader

fun readFirstLineFromFile(filename: String): String {
    BufferedReader(FileReader(filename)).use { br -> // BufferedReader 객체를 만들고 use함수를 호출하면서 파일에 대한 연산을 실행할 람다를 넘긴다
        return br.readLine()
    }
}