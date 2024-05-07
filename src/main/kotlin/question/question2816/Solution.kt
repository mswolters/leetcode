package nl.drbreakalot.question.question2816

import nl.drbreakalot.ListNode

class Solution {

    // Because we're only doubling, the carry can never propagate more than 1 node
    // This lets us double each node separately
    fun doubleIt(head: ListNode?): ListNode? {
        var current = head
        val start = ListNode(0).apply { next = head }
        var previous = start
        while (current != null) {
            current.`val` *= 2
            if (current.`val` >= 10) {
                current.`val` -= 10
                previous.`val` += 1
            }
            previous = current
            current = current.next
        }
        return if (start.`val` == 0) start.next else start
    }
}

