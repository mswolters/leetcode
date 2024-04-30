package question.question1235

import nl.drbreakalot.question.question1235.Solution
import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val solution = Solution()

    @Test
    fun test1() {
        val startTime = intArrayOf(1, 2, 3, 3)
        val endTime = intArrayOf(3, 4, 5, 6)
        val profit = intArrayOf(50, 10, 40, 70)
        val expected = 120
        val result = solution.jobScheduling(startTime, endTime, profit)
        assertEquals(expected, result)
    }

    @Test
    fun test2() {
        val startTime = intArrayOf(1, 2, 3, 4, 6)
        val endTime = intArrayOf(3, 5, 10, 6, 9)
        val profit = intArrayOf(20, 20, 100, 70, 60)
        val expected = 150
        val result = solution.jobScheduling(startTime, endTime, profit)
        assertEquals(expected, result)
    }

    @Test
    fun test3() {
        val startTime = intArrayOf(1, 1, 1)
        val endTime = intArrayOf(2, 3, 4)
        val profit = intArrayOf(5, 6, 4)
        val expected = 6
        val result = solution.jobScheduling(startTime, endTime, profit)
        assertEquals(expected, result)
    }

    @Test
    fun test4() {
        val startTime = intArrayOf(1,2,2,3)
        val endTime = intArrayOf(2,5,3,4)
        val profit = intArrayOf(3,4,1,2)
        val expected = 7
        val result = solution.jobScheduling(startTime, endTime, profit)
        assertEquals(expected, result)
    }

    @Test
    fun test5() {
        val startTime = intArrayOf(6,15,7,11,1,3,16,2)
        val endTime = intArrayOf(19,18,19,16,10,8,19,8)
        val profit = intArrayOf(2,9,1,19,5,7,3,19)
        val expected = 41
        val result = solution.jobScheduling(startTime, endTime, profit)
        assertEquals(expected, result)
    }

}