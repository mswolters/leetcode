package question.question65

import nl.drbreakalot.question.question65.Solution
import org.junit.jupiter.api.Assertions.assertTrue
import kotlin.test.Test
import kotlin.test.assertFalse

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testTrues() {
        val s = arrayOf("2", "0089", "-0.1", "+3.14", "4.", "-.9", "2e10", "-90E3", "3e+7", "+6e-1", "53.5e93", "-123.456e789")
        for (i in s) {
            val result = solution.isNumber(i)
            assertTrue(result, "$i should be a number")
        }
    }

    @Test
    fun testFalses() {
        val s = arrayOf("abc", "1a", "1e", "e3", "99e2.5", "--6", "-+3", "95a54e53", ".e1", "4e+", "+.", ".")
        for (i in s) {
            val result = solution.isNumber(i)
            assertFalse(result, "$i should not be a number")
        }
    }

}