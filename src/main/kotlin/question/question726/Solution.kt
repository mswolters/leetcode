package question.question726

class Solution {
    fun countOfAtoms(formula: String): String {
        val counts = countAtoms(formula)
        return counts.toSortedMap().toList().joinToString(separator = "") {
            (key, value) -> key + if (value > 1) value else ""
        }
    }

    fun countAtoms(formula: String): Map<String, Int> {
        val firstElement = parseFirstElement(formula)
        if (firstElement.length == formula.length) {
            return firstElement.value
        }

        val rest = countAtoms(formula.substring(firstElement.length))
        return (firstElement.value.keys + rest.keys).associateWith { (firstElement.value[it] ?: 0) + (rest[it] ?: 0) }
    }

    fun parseFirstElement(formula: String): ElementData {
        if (formula.isEmpty()) return ElementData(0, emptyMap())
        val firstElement =
        if (formula.startsWith("(")) {
            parseBracketElement(formula)
        } else {
            parseElement(formula)
        }
        if (firstElement.length == formula.length) {
            return firstElement
        }
        if (!formula[firstElement.length].isDigit()) {
            return firstElement
        }
        var count = 0
        var countLength = 0
        for (c in formula.substring(firstElement.length)) {
            if (c.isDigit()) {
                countLength++
                count = count * 10 + c.digitToInt()
            } else {
                break
            }
        }
        return ElementData(firstElement.length + countLength, firstElement.value.mapValues { (_, v) -> v * count })
    }

    private fun parseElement(formula: String): ElementData {
        for ((index, c) in formula.withIndex()) {
            if (index != 0 && indicatesEndOfElementName(c)) {
                return ElementData(index, mapOf(formula.substring(0, index) to 1))
            }
        }
        return ElementData(formula.length, mapOf(formula to 1))
    }

    private fun indicatesEndOfElementName(char: Char): Boolean {
        return char.isUpperCase() || char.isDigit() || char == '('
    }

    private fun parseBracketElement(formula: String): ElementData {
        var bracketCount = 0
        for ((index, c) in formula.withIndex()) {
            when (c) {
                '(' -> bracketCount++
                ')' -> bracketCount--
            }
            if (bracketCount == 0) return ElementData(index + 1, countAtoms(formula.substring(1, index)))
        }
        throw Exception("Mismatched brackets: $formula")
    }

    data class ElementData(val length: Int, val value: Map<String, Int>)
}