package ch11.fruit

sealed class Fruit {
    abstract val weight: Int
}

data class Apple(
    override val weight: Int,
    val color: String,
): Fruit()

data class Orange(
    override val weight: Int,
    val juicy: Boolean,
): Fruit()

fun main() {
    val weightComparator = Comparator<Fruit> { a, b ->
        a.weight - b.weight
    }
    val fruits: List<Fruit> = listOf(
        Orange(180, true),
        Apple(100, "green")
    )
    val apples: List<Apple> = listOf(
        Apple(50, "red"),
        Apple(120, "green"),
        Apple(155, "yellow")
    )
    println(fruits.sortedWith(weightComparator)) //Fruit의 하위 타입인 객체(사과나 오렌지)들이 모인 컬렉션에 대해 무게를 사용한 Comparator를 쓸 수 있다
    // [Apple(weight=100, color=green), Orange(weight=180, juicy=true)]
    println(apples.sortedWith(weightComparator))
    // [Apple(weight=50, color=red), Apple(weight=120, color=green), Apple(weight=155, color=yellow)]
}