class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
      if(nums.size < 0) return false
      for(i in 0 until nums.size){
         for( j in i +1 until nums.size){
            if(nums[i] == nums[j]){
               return true
            }
         }   
      }
      return false;
    }
}
