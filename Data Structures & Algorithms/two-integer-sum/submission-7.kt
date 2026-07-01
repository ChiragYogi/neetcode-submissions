class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray { 
       val localList = nums.toMutableList()
        localList.sort()

        var start = 0
        var end = localList.size - 1

        while (start < end){
            val current = localList[start] + localList[end]

            if (current == target){
               val firstValue = nums.indexOf(localList[start])
               val secondValue = nums.lastIndexOf(localList[end])
                return intArrayOf(minOf(firstValue,secondValue),maxOf(firstValue,secondValue))
            }else if (current < target){
                start++
            }else{
                end--
            }
        }
      return intArrayOf()

    }
}
