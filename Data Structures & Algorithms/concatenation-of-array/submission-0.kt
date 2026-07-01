class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
        val sizeN = nums.size
        val ansArray = IntArray(sizeN * 2)
            
        for(num in nums.indices){
            ansArray[num] = nums[num]
            ansArray[num + sizeN] = nums[num]
        }
        return ansArray
    }
}
