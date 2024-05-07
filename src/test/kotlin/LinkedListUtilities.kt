import nl.drbreakalot.ListNode

fun List<Int>.toLinkedList(): ListNode? {
    return this.reversed().fold(null as ListNode?) { acc, it -> ListNode(it).apply { next = acc } }
}

fun ListNode?.toList(): List<Int> {
    var current = this
    val out = mutableListOf<Int>()
    while (current != null) {
        out += current.`val`
        current = current.next
    }
    return out
}

