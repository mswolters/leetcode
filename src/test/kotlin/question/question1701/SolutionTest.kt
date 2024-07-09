package question.question1701

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {

    private val solution = Solution()

    @Test
    fun test1() {
        val customers = arrayOf(intArrayOf(1, 2), intArrayOf(2, 5), intArrayOf(4, 3))
        val expected = 5.0
        val result = solution.averageWaitingTime(customers)
        assertEquals(expected, result)
    }

    @Test
    fun test2() {
        val customers = arrayOf(intArrayOf(5, 2), intArrayOf(5, 4), intArrayOf(10, 3), intArrayOf(20, 1))
        val expected = 3.25
        val result = solution.averageWaitingTime(customers)
        assertEquals(expected, result)
    }

}