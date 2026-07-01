class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val duplicate = hashSetOf<Int>()

        for(i in nums){
            if(!duplicate.add(i)) {
                return true
            }
        }
        return false
    }
}
