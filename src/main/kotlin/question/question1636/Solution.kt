package question.question1636

class Solution {
    fun frequencySort(nums: IntArray): IntArray {
        val frequencies = nums.groupBy { it }.mapValues { (_, v) -> v.size }
        val sortedFrequencies = frequencies.toList().sortedBy { (k, f) -> f * 200 - k }
        return sequence {
            for ((k, f) in sortedFrequencies) {
                repeat(f) {
                    yield(k)
                }
            }
        }.toList().toIntArray()
    }
}