class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var result = 0
        var count = 0

        for(num in nums){
            count = if(num == 1) count +1 else 0
            result = maxOf(result,count)
        }

        return result

    }
}
