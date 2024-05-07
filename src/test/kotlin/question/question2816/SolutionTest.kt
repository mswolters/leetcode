package question.question2816

import nl.drbreakalot.question.question2816.*
import toLinkedList
import toList
import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {

    private val solution = Solution()

    @Test
    fun test1() {
        val head = listOf(1, 2, 3).toLinkedList()
        val expected = listOf(2, 4, 6)
        val result = solution.doubleIt(head).toList()
        assertEquals(expected, result)
    }

    @Test
    fun test2() {
        val head = listOf(1, 8, 9).toLinkedList()
        val expected = listOf(3, 7, 8)
        val result = solution.doubleIt(head).toList()
        assertEquals(expected, result)
    }

    @Test
    fun test3() {
        val head = listOf(9, 9, 9).toLinkedList()
        val expected = listOf(1, 9, 9, 8)
        val result = solution.doubleIt(head).toList()
        assertEquals(expected, result)
    }

    @Test
    fun test4() {
        val head = listOf(0).toLinkedList()
        val expected = listOf(0)
        val result = solution.doubleIt(head).toList()
        assertEquals(expected, result)
    }

}