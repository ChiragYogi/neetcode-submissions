class Solution {
    fun calPoints(operations: Array<String>): Int {

        val result = ArrayDeque<Int>()
        var res = 0

        for(i in operations){
            when(i){
                "+" -> {
                  val score1 = result.removeLast()
                  val score2 = result.removeLast()
                  result.add(score2)
                  result.add(score1)
                  result.add(score2 + score1)  
                  res+= result.last()
                    
                }
                "C" -> {
                  if(result.isNotEmpty()){
                    res -= result.removeLast()
                  }      
                }
                "D" -> {
                   val score = 2 * result.last()
                   result.add(score )     
                   res +=  score
                } 
                else ->{
                    result.addLast(i.toInt())
                    res+=i.toInt()
                }
            }
        }

        return res

    }
}
