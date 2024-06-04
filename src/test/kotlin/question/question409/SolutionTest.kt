package question.question409

import nl.drbreakalot.question.question409.Solution
import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    
    val solution = Solution()
    
@Test
    fun test1() {
        val s = "abccccdd"
        val result = solution.longestPalindrome(s)
        assertEquals(7, result)
    }

    @Test
    fun test2() {
        val s = "a"
        val result = solution.longestPalindrome(s)
        assertEquals(1, result)
    }

    @Test
    fun test3() {
        val s = "bb"
        val result = solution.longestPalindrome(s)
        assertEquals(2, result)
    }

    @Test
    fun test4() {
        val s = "ab"
        val result = solution.longestPalindrome(s)
        assertEquals(1, result)
    }

    
}