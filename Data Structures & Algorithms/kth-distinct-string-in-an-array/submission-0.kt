class Solution {
    fun kthDistinct(arr: Array<String>, k: Int): String {

        val count = mutableMapOf<String,Int>()

        for(s in arr){
            count[s] = count.getOrDefault(s,0) + 1
        }

        var cnt = k
        for(s in arr){
            if(count[s] == 1){
                cnt--
                if(cnt==0){
                    return s
                }
            }
        }

        return ""
        
    }
}