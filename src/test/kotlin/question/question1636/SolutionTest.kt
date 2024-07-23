package question.question1636

import kotlin.test.*

class SolutionTest {

    val solution = Solution()

    @Test
    fun test1() {
        val nums = intArrayOf(1, 1, 2, 2, 2, 3)
        val result = solution.frequencySort(nums)
        assertContentEquals(intArrayOf(3, 1, 1, 2, 2, 2), result)
    }

    @Test
    fun test2() {
        val nums = intArrayOf(2, 3, 1, 3, 2)
        val result = solution.frequencySort(nums)
        assertContentEquals(intArrayOf(1, 3, 3, 2, 2), result)
    }

    @Test
    fun test3() {
        val nums = intArrayOf(-1, 1, -6, 4, 5, -6, 1, 4, 1)
        val result = solution.frequencySort(nums)
        assertContentEquals(intArrayOf(5, -1, 4, 4, -6, -6, 1, 1, 1), result)
    }


}