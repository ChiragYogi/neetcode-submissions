class Solution {
    fun countSeniors(details: Array<String>): Int {

        var result = 0

        for(input in details){
            val age = input.substring(11,13)
            println(age)
            if(age.toInt() > 60){
                result++
            }
        }
        return result
    }
}
