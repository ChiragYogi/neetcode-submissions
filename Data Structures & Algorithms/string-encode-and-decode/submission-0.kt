class Solution {
   fun encode(strs: List<String>): String {
        val result = StringBuilder()
        for(str in strs){
            result.append(str.length).append("#").append(str)
        }
        return result.toString()
    }

    fun decode(str: String): List<String> {
        val result = mutableListOf<String>()
        var i = 0
        while(i < str.length){
            var j = i
            while(str[j] != '#'){
                j++
            }
            val length = str.substring(i,j).toInt()
            i = j + 1
            result.add(str.substring(i,i+length))
            i+= length
        }
        return result
    }
}
