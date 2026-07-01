class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        var result= HashSet<List<Int>>()
        nums.sort()
        for(i in nums){
            println(i)
        }
        for(i in nums.indices){
            for(j in i+1 until nums.size){
                for(k in j+1 until nums.size){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        result.add(listOf(nums[i], nums[j], nums[k]))
                    }
                }
            }
        }
       return result.map{ it.toList()}     
    }
}
