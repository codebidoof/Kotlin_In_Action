package ch10.ex10_10_HardCodingFilter

import ch10.ex10_9_siteVisitedData.OS
import ch10.ex10_9_siteVisitedData.SiteVisit
import ch10.ex10_9_siteVisitedData.log

val averageWindowsDuration = log
    .filter { it.os == OS.WINDOWS }
    .map(SiteVisit::duration)
    .average()

fun main() {
    println(averageWindowsDuration)
    // 23.0
}