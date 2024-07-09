package question.question1701

import kotlin.math.max

class Solution {
    fun averageWaitingTime(customers: Array<IntArray>): Double {
        var currentTime = 0
        var currentWaitingTime = 0
        var runningAverage = 0.0
        for ((index, customer) in customers.withIndex()) {
            val (arrivalTime, prepTime) = customer
            currentWaitingTime = max(0, currentWaitingTime - (arrivalTime - currentTime))
            currentTime = arrivalTime
            currentWaitingTime += prepTime
            val weight = 1.0 / (index + 1)
            runningAverage = runningAverage * (1 - weight) + currentWaitingTime * weight
        }
        return runningAverage
    }
}