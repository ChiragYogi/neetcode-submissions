class Solution {
    fun largestUniqueNumber(nums: IntArray): Int {

        val n = nums.size

        if(n == 1){
            return nums[0]
        }

        var frequencyMap = mutableMapOf<Int,Int>()

        for(num in nums){
            frequencyMap[num] = frequencyMap.getOrDefault(num,0)+1
        }

        var largestUnique = -1

        for((num,freq) in frequencyMap){
            if(freq == 1 && num > largestUnique){
                largestUnique = num
            }
        }
        return largestUnique

    }
}
