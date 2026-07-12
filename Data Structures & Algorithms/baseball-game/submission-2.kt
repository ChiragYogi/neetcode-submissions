class Solution {
    fun calPoints(operations: Array<String>): Int {

        val result = ArrayDeque<Int>()

        for(i in operations){
            when(i){
                "+" -> {
                  val score1 = result.removeLast()
                  val score2 = result.removeLast()
                  result.add(score2)
                  result.add(score1)
                  result.add(score2 + score1)      
                }
                "C" -> {
                  if(result.isNotEmpty()){
                    result.removeLast()
                  }      
                }
                "D" -> {
                   val score = result.last()
                   result.add(score * 2)     
                } 
                else ->{
                    result.addLast(i.toInt())
                }
            }
        }

        var endResult = 0

        for(i in result){
            endResult +=i
        }

        return endResult

    }
}
