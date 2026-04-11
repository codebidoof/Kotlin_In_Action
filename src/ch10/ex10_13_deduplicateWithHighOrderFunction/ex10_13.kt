package ch10.ex10_13_deduplicateWithHighOrderFunction

import ch10.ex10_9_siteVisitedData.OS
import ch10.ex10_9_siteVisitedData.SiteVisit
import ch10.ex10_9_siteVisitedData.log

fun List<SiteVisit>.averageDurationFor(predicate: (SiteVisit) -> Boolean) =
    filter(predicate).map(SiteVisit::duration).average()

fun main() {
    println(
        log.averageDurationFor {
            it.os in setOf(OS.ANDROID, OS.IOS)
        }
    )
    // 12.15
    println(
        log.averageDurationFor {
            it.os == OS.IOS && it.path == "/signup"
        }
    )
    // 8.0
}
