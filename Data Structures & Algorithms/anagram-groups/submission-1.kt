class Solution {
    
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        // Idea:
        // - Two strings are anagrams if their sorted characters are identical.
        // - Use the sorted string as a unique key.
        // - Group all original strings that produce the same key.
        val anagram = hashMapOf<String,MutableList<String>>()

        for(s in strs){
            // Canonical representation of all anagrams.
            val sorted = s.toCharArray().sorted().joinToString("")
            anagram.getOrPut(sorted){mutableListOf()}.add(s)
        }
        return anagram.values.toList()
    }

    // Pattern: HashMap + Canonical Representation  
    // Key   -> Sorted characters
    // Value -> All strings matching that key
    // Example:
    //eat -> aet
    // tea -> aet
    // ate -> aet
    // Map:
    // aet -> [eat, tea, ate]
}
