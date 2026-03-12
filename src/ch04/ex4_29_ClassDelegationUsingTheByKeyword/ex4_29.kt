package ch04.ex4_29_ClassDelegationUsingTheByKeyword

//원소를 추가하려고 시도한 횟수를 기록하는 컬렉션
class CountingSet<T>(
    private val innerSet: MutableCollection<T> = hashSetOf<T>()
): MutableCollection<T> by innerSet {

    var objectsAdded = 0

    //위임하지 않고 새로운 구현을 오버라이드해 제공
    override fun add(element: T): Boolean {
        objectsAdded++
        return innerSet.add(element)
    }

    //위임하지 않고 새로운 구현을 오버라이드해 제공
    override fun addAll(elements: Collection<T>): Boolean {
        objectsAdded += elements.size
        return innerSet.addAll(elements)
    }
}

fun main() {
    val cset = CountingSet<Int>()
    cset.addAll(listOf(1, 1, 2))
    println("Added ${cset.objectsAdded} objects, ${cset.size} uniques.")
    // Add 3 objects, 2 uniques
}