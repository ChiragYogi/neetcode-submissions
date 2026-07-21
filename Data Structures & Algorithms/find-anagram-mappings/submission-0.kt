class Solution {
    fun anagramMappings(nums1: IntArray, nums2: IntArray): IntArray {

        var result = IntArray(nums1.size)

        val resultMap = hashMapOf<Int,Int>()


        for((index,num) in nums2.withIndex()){
            resultMap[num] = index
        }

        for((index,num) in nums1.withIndex()){
            if(resultMap.containsKey(num)){
                result[index] = resultMap.get(num) ?: 0
            }
        }

        return result

    }
}
