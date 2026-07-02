class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val n = temperatures.size    
        val result = IntArray(n)

        for(i in 0 until n){
            for(j in i + 1 until n){
                if(temperatures[j] > temperatures[i]){
                    result[i] = j-i
                    break
                }
            }
           
        }
         return result
    }
   
}
