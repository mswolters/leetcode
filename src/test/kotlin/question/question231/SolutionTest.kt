package question.question231

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class SolutionTest {

    val solution = Solution()

    @Test
    fun test1() {
        val n = 1
        val result = solution.isPowerOfTwo(n)
        assertTrue(result)
    }

    @Test
    fun test2() {
        val n = 16
        val result = solution.isPowerOfTwo(n)
        assertTrue(result)
    }

    @Test
    fun test3() {
        val n = 3
        val result = solution.isPowerOfTwo(n)
        assertFalse(result)
    }

    @Test
    fun test4() {
        val n = -2147483648
        val result = solution.isPowerOfTwo(n)
        assertFalse(result)
    }

}