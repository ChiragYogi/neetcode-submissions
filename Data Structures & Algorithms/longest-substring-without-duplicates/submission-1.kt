class Solution {
    fun lengthOfLongestSubstring(s: String): Int {

       var result = 0 
       val charSet = mutableSetOf<Char>()
       var left= 0


       for(right in s.indices){
            while(s[right] in charSet){
                charSet.remove(s[left])
                left++
            }
            charSet.add(s[right])
            result = maxOf(result,right - left + 1)
       }


        return result


    }
}
