class Solution {
    fun findMin(nums: IntArray): Int {

        var result = Int.MAX_VALUE

        var left = 0
        var right = nums.size -1 

        while(left < right){
            val mid = left + (right-left) /2

            if(nums[mid] >nums[right]){
                left = mid +1
            }else{
                right = mid
            }
        }
        return nums[left]

    }
}
