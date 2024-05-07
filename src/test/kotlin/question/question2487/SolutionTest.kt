package question.question2487

import nl.drbreakalot.question.question2487.Solution
import toLinkedList
import toList
import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {

    val solution = Solution()

    @Test
    fun test1() {
        val head = listOf(5, 2, 13, 3, 8).toLinkedList()
        val expected = listOf(13, 8)
        val result = solution.removeNodes(head).toList()
        assertEquals(expected, result)
    }

    @Test
    fun test2() {
        val head = listOf(1, 1, 1, 1).toLinkedList()
        val expected = listOf(1, 1, 1, 1)
        val result = solution.removeNodes(head).toList()
        assertEquals(expected, result)
    }

    @Test
    fun test3() {
        val head = listOf(1, 2, 3, 4).toLinkedList()
        val expected = listOf(4)
        val result = solution.removeNodes(head).toList()
        assertEquals(expected, result)
    }

    @Test
    fun test4() {
        val head = listOf(5, 2, 13, 3, 9, 8, 10, 8, 3).toLinkedList()
        val expected = listOf(13, 10, 8, 3)
        val result = solution.removeNodes(head).toList()
        assertEquals(expected, result)
    }

    @Test
    fun testHugeInput() {
        val expected = List(100000) { 100000 - it }
        val head = expected.toLinkedList()
        val result = solution.removeNodes(head).toList()
        assertEquals(expected, result)
    }
}