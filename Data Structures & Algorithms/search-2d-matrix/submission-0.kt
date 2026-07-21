class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {

        for(row in matrix){
            for(colum in row){
                if(colum == target){
                    return true
                }
            }
        }

        return false

    }
}
