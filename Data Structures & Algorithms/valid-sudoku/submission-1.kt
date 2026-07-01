class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val row = Array(9) { HashSet<Char>()}
        val coulm = Array(9) {HashSet<Char>()}
        val squared = Array(9) {HashSet<Char>()}

        for(r in 0 until 9){
            for(c in 0 until 9){
                val value = board[r][c]
                if(value == '.') continue

                val squreIdx = (r/3) * 3 + (c/3)
                println(squreIdx)
                if(value in row[r] || value in coulm[c] || value in squared[squreIdx]) return false

                row[r].add(value)
                coulm[c].add(value)
                squared[squreIdx].add(value)
            }    
        }
        return true
    }
}
