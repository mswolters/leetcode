package question.question231

class Solution {
    fun isPowerOfTwo(n: Int): Boolean {
        return n > 0 && n.countOneBits() == 1
    }
}