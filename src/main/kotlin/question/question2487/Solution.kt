package nl.drbreakalot.question.question2487

import nl.drbreakalot.ListNode

class Solution {
    fun removeNodes(head: ListNode?): ListNode? {
        val list = mutableListOf<Int>()
        var current = head
        while (current != null) {
            list += current.`val`
            current = current.next
        }
        val test = list.asReversed().runningFold(0) { acc, value -> if (value > acc) value else acc }.drop(1).asReversed()
        val toReturn = test.zip(list).mapNotNull { (max, value) -> if (value >= max) value else null }

        val newHead = ListNode(0)
        var last: ListNode? = newHead
        for (value in toReturn) {
            last!!.next = ListNode(value)
            last = last.next
        }
        return newHead.next
    }
}

