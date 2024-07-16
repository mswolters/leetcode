package question.question726

import kotlin.test.*

class SolutionTest {

    val solution = Solution()

    @Test
    fun test1() {
        val formula = "H2O"
        val result = solution.countOfAtoms(formula)
        assertEquals("H2O", result)
    }

    @Test
    fun test2() {
        val formula = "Mg(OH)2"
        val result = solution.countOfAtoms(formula)
        assertEquals("H2MgO2", result)
    }

    @Test
    fun test3() {
        val formula = "K4(ON(SO3)2)2"
        val result = solution.countOfAtoms(formula)
        assertEquals("K4N2O14S4", result)
    }

}