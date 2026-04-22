package ch13.ex13_21_Dialga

import kotlin.time.Duration
import kotlin.time.DurationUnit
import kotlin.time.toDuration

val Int.days: Duration
    get() = this.toDuration(DurationUnit.DAYS) // this는 상수의 값을 가리킨당

val Int.hours: Duration
    get() = this.toDuration(DurationUnit.HOURS) // 내장 toDuration 함수에게 변환을 위임한다.

// ex: 2.fortnights
val Int.fortnights: Duration get() =
    (this*14).toDuration(DurationUnit.DAYS)