/**
 * Definition of Interval:
 * class Interval(var start: Int, var end: Int) {}
 */

class Solution {
    fun canAttendMeetings(intervals: List<Interval>): Boolean {

        for(parent in 0 until intervals.size){
            for(child in parent + 1 until intervals.size){
                if(minOf(intervals[parent].end,intervals[child].end) > maxOf(intervals[parent].start,intervals[child].start)){
                    return false
                }
            }
        }
        return true
    }
}
