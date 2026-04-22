package ch13.ex13_18_shouldSentence

import io.kotest.matchers.should
import io.kotest.matchers.string.startWith
import org.junit.jupiter.api.Test

class PrefixTest {
    @Test
    fun testKPrefix() {
        val s = "kotlin".uppercase()
        s should startWith("K")
    }
}