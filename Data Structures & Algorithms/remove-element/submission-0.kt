class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var result = 0
        for(i in nums.indices){
            if(nums[i] !=  `val`){
                nums[result++] = nums[i]
            }
        }
        return result
    }
}
