package ch05.ex5_21_makeAlphabetWithbuildString

fun alphabet() = buildString {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
}