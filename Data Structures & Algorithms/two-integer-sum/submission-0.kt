class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray { 
      val resultList = mutableListOf<Int>()
      val currentTranget = target

      for(i in 0 until nums.size){
         for(j in i+1 until nums.size){
            if(nums[i] + nums[j] == target){
              resultList.add(i)    
            resultList.add(j) 
            return resultList.toIntArray()
            }
         }   
      }
      return resultList.toIntArray()

    }
}
