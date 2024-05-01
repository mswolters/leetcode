package nl.drbreakalot.question.question2997

class Solution {

    fun minOperations(nums: IntArray, k: Int): Int {
        return nums.fold(k) { acc, i -> acc xor i }.countOneBits()
    }

}