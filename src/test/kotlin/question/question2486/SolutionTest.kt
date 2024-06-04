package question.question2486

import nl.drbreakalot.question.question2486.Solution
import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {

    val solution = Solution()

    @Test
    fun test1() {
        val s = "ab"
        val t = "ab"
        val result = solution.appendCharacters(s, t)
        assertEquals(0, result)
    }

    @Test
    fun test2() {
        val s = "ab"
        val t = "ba"
        val result = solution.appendCharacters(s, t)
        assertEquals(1, result)
    }

    @Test
    fun test3() {
        val s = "coaching"
        val t = "coding"
        val result = solution.appendCharacters(s, t)
        assertEquals(4, result)
    }

    @Test
    fun test4() {
        val s = "z"
        val t = "abcde"
        val result = solution.appendCharacters(s, t)
        assertEquals(5, result)
    }

    @Test
    fun test5() {
        val s = "coding"
        val t = "codding"
        val result = solution.appendCharacters(s, t)
        assertEquals(4, result)
    }

}