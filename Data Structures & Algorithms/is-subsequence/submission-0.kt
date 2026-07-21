class Solution {
    fun isSubsequence(s: String, t: String): Boolean {

        var firstStringPointer = 0
        var  secondStringPointer = 0

        while(firstStringPointer < s.length && secondStringPointer < t.length){
            if(s[firstStringPointer] == t[secondStringPointer]){
                firstStringPointer++
            }
            secondStringPointer++
        }
        return firstStringPointer == s.length

    }
}
