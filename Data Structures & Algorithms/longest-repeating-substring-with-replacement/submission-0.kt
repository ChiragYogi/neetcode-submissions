class Solution {
    fun characterReplacement(s: String, k: Int): Int {

        var res = 0

        for(i in s.indices){
            val count = HashMap<Char,Int>()
            var maxF = 0
            for(j in i until s.length){
                count[s[j]] = count.getOrDefault(s[j], 0) + 1
                maxF = maxOf(maxF,count[s[j]]!!)
                if((j-i+1) - maxF <=k){
                    res = maxOf(res,j-i+1)
                }
            }
        }
        return res

    }
}
