package ch04.ex4_29_ClassDelegationUsingTheByKeyword

// 직접 위임 구현
class DelegatingCollection<T>: Collection<T> {
    private val innerList = arrayListOf<T>() //항상 내부에서 새 리스트를 만듦.
    override val size: Int
        get() = innerList.size

    override fun isEmpty(): Boolean {
        return innerList.isEmpty()
    }

    override fun contains(element: T): Boolean {
        return innerList.contains(element)
    }

    override fun iterator(): Iterator<T> {
        return innerList.iterator()
    }

    override fun containsAll(elements: Collection<T>): Boolean {
        return innerList.containsAll(elements)
    }

}

//코틀린의 by키워드로 자동 위임. 컴파일러가 첫 번째 코드처럼 자동으로 만들어준다.
class DelegatingCollection1<T> (
    innerList: Collection<T> = mutableListOf<T>() //외부에서 컬렉션을 전달할 수도 있음
): Collection<T> by innerList