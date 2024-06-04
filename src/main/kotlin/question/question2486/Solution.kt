package nl.drbreakalot.question.question2486

class Solution {

    fun appendCharacters(s: String, t: String): Int {
        var currentSearchIndex = 0
        var characterToFindIndex = 0
        while (characterToFindIndex < t.length && currentSearchIndex < s.length) {
            while (currentSearchIndex < s.length) {
                if (s[currentSearchIndex] == t[characterToFindIndex]) {
                    currentSearchIndex++
                    characterToFindIndex++
                    break
                } else {
                    currentSearchIndex++
                }
            }
        }
        return t.length - characterToFindIndex
    }

}