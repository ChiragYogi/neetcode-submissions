class Solution {
    fun replaceElements(arr: IntArray): IntArray {
        var result = IntArray(arr.size)

       for(i in 0 until arr.size){
         var max = -1
        for(j in i + 1 until arr.size){
              max = maxOf(max,arr[j])      
            }
         result[i] = max
           
       }
    return result
    }

}
