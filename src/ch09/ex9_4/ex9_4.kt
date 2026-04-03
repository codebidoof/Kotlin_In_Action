package ch09.ex9_4

operator fun Char.times(count: Int) : String {
    return toString().repeat(count)
}