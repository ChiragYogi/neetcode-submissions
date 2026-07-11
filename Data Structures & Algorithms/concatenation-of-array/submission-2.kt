class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
        val result = IntArray(nums.size * 2)

        for(num in nums.indices){
            result[num] = nums[num]
            result[num + nums.size] = nums[num]
        }
        return result

    }
}
