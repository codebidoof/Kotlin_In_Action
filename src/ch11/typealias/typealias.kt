package ch11.`typealias`

typealias NameCombiner = (String, String, String, String) -> String

val authorCombiner: NameCombiner = { a, b, c, d -> "$a et al."}
val bandCombiner: NameCombiner = { a, b, c, d -> "$a $b & The Gang"}

fun combineAuthors(combiner: NameCombiner){
    println(combiner("Steve", "Seb", "Dima", "Roman"))
}

fun main() {
    combineAuthors(bandCombiner)
    // Steve Seb & The Gang
    combineAuthors(authorCombiner)
    // Steve et al.
    combineAuthors { a, b, c, d -> "$d, $c & Co." }
    // Roman, Dima & Co.
}