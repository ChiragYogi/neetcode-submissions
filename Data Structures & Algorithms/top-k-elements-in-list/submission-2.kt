class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
       val count = HashMap<Int,Int>()
       //create map and add the single num as key and frequency as value
       for (num in nums){
            count[num] = count.getOrDefault(num,0) + 1
       }

       //create list of pair where we will have the nam and frequency
       val arr = mutableListOf<Pair<Int,Int>>()
       for ((num,freq) in count){
        arr.add(Pair(freq,num))
       }
        //sort the list in ascanding order based on freq
        arr.sortByDescending{it.first}

        //create new int array and set the elemt at inex based on the value
        val result = IntArray(k)
        for(i in 0 until k){
            result[i] = arr[i].second
        }
        return result

    }
}
