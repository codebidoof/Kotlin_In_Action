package ch10.ex10_11_deduplicateByGeneralFunction

import ch10.ex10_9_siteVisitedData.OS
import ch10.ex10_9_siteVisitedData.SiteVisit
import ch10.ex10_9_siteVisitedData.log

fun List<SiteVisit>.averageDurationFor(os: OS) = // 중복 코드를 별도 함수로 추출한다.
    filter { it.os == os }.map(SiteVisit::duration).average()

fun main() {
    println(log.averageDurationFor(OS.WINDOWS))
    // 23.0
    println(log.averageDurationFor(OS.MAC))
    // 22.0
}