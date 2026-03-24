package ch07.ex7_8_notNullAssrtion

class SelectableTextList(
    val contents: List<String>,
    var selectedIndex: Int? = null
)

class CopyRowAction(val list: SelectableTextList) {
    fun isActionEnabled(): Boolean =
        list.selectedIndex != null

    fun executeCopyRow() {
        val index = list.selectedIndex!!
        val value = list.contents[index]
    }
}