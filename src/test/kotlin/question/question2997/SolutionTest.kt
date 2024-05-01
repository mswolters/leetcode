package question.question2997

import nl.drbreakalot.question.question2997.Solution
import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {

    private val solution = Solution()

    @Test
    fun test1() {
        val nums = intArrayOf(2,1,3,4)
        val k = 1
        val expected = 2
        val result = solution.minOperations(nums, k)
        assertEquals(expected, result)
    }

    @Test
    fun test2() {
        val nums = intArrayOf(2,0,2,0)
        val k = 0
        val expected = 0
        val result = solution.minOperations(nums, k)
        assertEquals(expected, result)
    }

}