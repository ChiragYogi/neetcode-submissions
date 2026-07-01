class Solution {
    fun isAnagram(s: String, t: String): Boolean {
      if(s.length != t.length) return false
        val first = s.toCharArray().sorted().joinToString("") 
        val second = t.toCharArray().sorted().joinToString("") 
      return first.contentEquals(second)     
    }
}
