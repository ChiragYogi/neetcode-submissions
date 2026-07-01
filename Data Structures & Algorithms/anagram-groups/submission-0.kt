class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {

          //create a map which key will be sorted string and value would be the string wich match the sorted string
        val result = mutableMapOf<String, MutableList<String>>()

        //loop over our string
        for(s in strs){
            //first convert the string into character array
            //then sort it which will retrun us sorted array
            //then use joinToString funcation to get string frm array
            val sortedString = s.toCharArray().sorted().joinToString("")
            //now use this string as the key in our map
            //if any string that will be sorted has  as key in our map
            //the getOrPut funcation will eiter get that entry from map and update the list with our stinng
            //if not then it will create new entry in our map with the key and new list 
            result.getOrPut(sortedString){mutableListOf()}.add(s)
        }
        //retrun the values from our map
        return result.values.toList()

    }
}
