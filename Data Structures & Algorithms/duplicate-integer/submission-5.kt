class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
      if(nums.size < 0) return false
      nums.sort()
      for(i in 1 until nums.size){
          if(nums[i] == nums[i-1]){
               return true
            }  
      }
      return false;
    }
}
