class Solution {
    fun longestConsecutive(nums: IntArray): Int {

        var res = 0
        val store = nums.toSet()

        for(num in nums){
            if((num-1) !in store){
                var length = 1
                while((num + length) in store){
                length++
              }
                res= maxOf(res,length)
            }
            
        }

        return res
    }
}
