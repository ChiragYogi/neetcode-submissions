class MinStack() {

    //create list of pair value and minvalue
    val stack = mutableListOf<Pair<Int,Int>>()

    fun push(`val`: Int) {
        //check empty if it is add at 0 index
        if(stack.isEmpty()){
            stack.add(Pair(`val`,`val`))
        }else{
            //get the min at last index
            val minStack = getMin()
            //get min of newvalue and currentstack value min
            val newMin = minOf(`val`,minStack)
            //add the new value and min value
            stack.add(Pair(`val`,newMin))
        }
    }

    fun pop() {
        //check empty before removing
        if(stack.isNotEmpty()){
         stack.removeAt(stack.size-1)
        }
    
    }
    //the first will be value added in list
    fun top(): Int {
        return stack.last().first
    }

   //the second will be value added in list as pair second
    fun getMin(): Int {
       return stack.last().second
    }
}
