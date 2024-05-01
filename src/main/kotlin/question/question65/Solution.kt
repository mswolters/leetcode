package nl.drbreakalot.question.question65

class Solution {

    private val regex = """\A[+\-]?(\d+|\d+\.|\d+\.\d+|\.\d+)([Ee][+\-]?\d+)?\Z""".toRegex()

    fun isNumber(s: String): Boolean {
        return regex.matches(s)
    }
}