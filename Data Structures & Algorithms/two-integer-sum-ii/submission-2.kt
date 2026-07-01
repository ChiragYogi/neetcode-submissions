class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        val n = numbers.size
        var left = 0
        var right = n - 1
        while(left < right){
            val total = numbers[left] + numbers[right]
            when{
                total > target -> {
                         right--
                }
                total < target -> {
                     left++   
                }
                else -> {
                    return intArrayOf(left + 1, right + 1)
                }
            }
            
        }
        return intArrayOf()
    }
}
