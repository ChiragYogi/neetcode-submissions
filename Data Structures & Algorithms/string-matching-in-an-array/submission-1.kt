class Solution {
    fun stringMatching(words: Array<String>): List<String> {
        var result = mutableSetOf<String>()

        for(i in words.indices){
            for(j in words.indices){
                if( i == j){
                    continue
                }
                if(words[j].contains(words[i])){
                    result.add(words[i])
                }
            }
        }
        return result.toList()

    }
}
