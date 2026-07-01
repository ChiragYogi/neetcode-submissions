class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray { 

      val prevMap = HashMap<Int,Int>()

      for((index,value) in nums.withIndex()){
         val diff = target - value
         if(prevMap.containsKey(diff)){
            return intArrayOf(prevMap[diff]!!,index)
         }
         prevMap[value] = index
      }

      return intArrayOf()

    }
}
