class DynamicArray(capacity: Int) {
    
    private var myArray:IntArray
    private var size:Int = 0 
    private var currentCapacity:Int = capacity

    init{
        this.myArray = IntArray(this.currentCapacity)
    }

    fun get(i: Int): Int {
        if(size == 0){
            return -1
        }
        return myArray[i]
    }

    fun set(i: Int, n: Int) {
         myArray[i] = n
    }

    fun pushback(n: Int) {
        if(size == currentCapacity){
            this.resize()
        }

        myArray[size] = n
        size++

    }

    fun popback(): Int {
        if(size > 0){
            size--
        }
        return myArray[size]
    }

    private fun resize() {
       currentCapacity = 2 * currentCapacity
       val newArray = IntArray(currentCapacity)

       for(i in 0 until size){
            newArray[i] = myArray[i]
       }

       myArray = newArray
    }

    fun getSize(): Int {
        return size
    }

    fun getCapacity(): Int {
        return currentCapacity
    }
}
