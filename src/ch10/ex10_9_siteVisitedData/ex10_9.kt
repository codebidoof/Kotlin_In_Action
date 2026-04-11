package ch10.ex10_9_siteVisitedData

data class SiteVisit(
    val path: String, // 사이트 경로
    val duration: Double, // 방문 시간
    val os: OS // 사용자의 운영체제
)

enum class OS { WINDOWS, LINUX, MAC, IOS, ANDROID }

val log = listOf(
    SiteVisit("/", 34.0, OS.WINDOWS),
    SiteVisit("/", 22.0, OS.MAC),
    SiteVisit("/login", 12.0, OS.WINDOWS),
    SiteVisit("/signup", 8.0, OS.IOS),
    SiteVisit("/", 16.3, OS.ANDROID)
)
