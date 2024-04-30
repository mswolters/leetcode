package nl.drbreakalot.question.question1235

import java.util.*

class Solution {
    data class Job(val startTime: Int, val endTime: Int, val profit: Int)

    fun jobScheduling(startTime: IntArray, endTime: IntArray, profit: IntArray): Int {
        val jobs = startTime.indices.map { Job(startTime[it], endTime[it], profit[it]) }
        return jobScheduling(jobs)
    }

    private fun jobScheduling(jobs: List<Job>): Int {
        val sortedJobs = jobs.sortedBy { it.endTime }
        val maxProfitUpTo = sortedMapOf<Int, Int>()

        for (job in sortedJobs) {
            val maxProfitUpToThis = findLastProfitUpTo(maxProfitUpTo, job.startTime)
            val maxProfitUpToEndOfThis = findLastProfitUpTo(maxProfitUpTo, job.endTime)
            val profitAfterThis = maxProfitUpToThis + job.profit
            if (maxProfitUpToEndOfThis < profitAfterThis) {
                maxProfitUpTo[job.endTime] = profitAfterThis
            }
        }

        return maxProfitUpTo[maxProfitUpTo.lastKey()]!!
    }

    private fun findLastProfitUpTo(profitUpTo: SortedMap<Int, Int>, index: Int): Int {
        val headMap = profitUpTo.headMap(index + 1)
        return if (headMap.isEmpty()) 0 else headMap[headMap.lastKey()]!!
    }

}