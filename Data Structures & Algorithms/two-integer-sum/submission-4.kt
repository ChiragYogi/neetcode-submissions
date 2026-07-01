class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray { 

      val prevMap = HashMap<Int,Int>()

      for((index,value) in nums.withIndex()){
         prevMap[value] = index
      }

      for((index,value) in nums.withIndex()){
         val diff = target - value
         if(prevMap.containsKey(diff) && prevMap[diff] != index){
            return intArrayOf(index,prevMap[diff]!!)
         }
      }

      return intArrayOf()

    }
}
