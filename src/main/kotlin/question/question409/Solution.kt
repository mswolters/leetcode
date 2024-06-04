package nl.drbreakalot.question.question409

class Solution {

    fun longestPalindrome(s: String): Int {
        val letterCounts = s.toCharArray().groupBy { it }.mapValues { (_, v) -> v.size }.values
        val hasOddNumber = letterCounts.any { it % 2 == 1 }
        return letterCounts.sumOf { it - (it % 2) } + if (hasOddNumber) 1 else 0
    }

}