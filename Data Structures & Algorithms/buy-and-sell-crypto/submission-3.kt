class Solution {
    fun maxProfit(prices: IntArray): Int {

        var price = 0
        var left = 0
        var right = 1
        
        while(right < prices.size){
           if(prices[left] < prices[right]){
                val profilt = prices[right] - prices[left]
                price = maxOf(price,profilt)
           }else{
             left = right
           } 
           right++    
        }

        return price

    }
}
