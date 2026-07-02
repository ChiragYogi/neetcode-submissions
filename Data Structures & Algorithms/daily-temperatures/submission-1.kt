class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val n = temperatures.size    
        val result = IntArray(n)

        val stack = ArrayDeque<Int>()

        for(i in temperatures.indices){
            while(stack.isNotEmpty() && temperatures[i] > temperatures[stack.last()]){
                val previusIndex = stack.removeLast()
                result[previusIndex] = i - previusIndex
            }
            stack.addLast(i)
        }

       
         return result
    }
   
}
