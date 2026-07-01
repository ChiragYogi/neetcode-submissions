
class Solution {
    fun isValid(s: String): Boolean {
         var newString = s
         while(newString.contains("()") || newString.contains("{}") || newString.contains("[]")){
             newString =    newString.replace("()","")
                  newString = newString.replace("{}","")
                   newString = newString.replace("[]","")
         }   
         return newString.isEmpty()

        // val stack = ArrayDeque<Char>()
        // val closeToOpen = hashMapOf(')' to '(',']' to '[' , '}' to '{')

        // for(character in s){
        //     println("for character ${character} ${closeToOpen[character]}")
        //     println("for character 1 ${stack.isNotEmpty() && stack.first() == closeToOpen[character]}")
        //     if(character in closeToOpen){
        //         if(stack.isNotEmpty() && stack.first() == closeToOpen[character]){
        //             stack.removeFirst()
        //         }else{
        //             return false
        //         }
        //     }else{
        //         stack.addFirst(character)
        //     }
        // }
        // return stack.isEmpty()
    }
}