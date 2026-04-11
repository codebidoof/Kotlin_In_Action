package ch10.ex10_12_analyzeVisitedDataByComplicatedHardcodingFilter

import ch10.ex10_9_siteVisitedData.OS
import ch10.ex10_9_siteVisitedData.SiteVisit
import ch10.ex10_9_siteVisitedData.log

fun main() {
    val averageWindowsDuration = log
        .filter { it.os in setOf(OS.IOS, OS.ANDROID) }
        .map(SiteVisit::duration)
        .average()
    println(averageWindowsDuration)
    // 12.15
}