class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i=1; i<prices.length; i++) {
            if(prices[i]>prices[i-1])
                profit += prices[i] - prices[i-1];
        }
        return profit;
    }
}

/*Another good solution 
class Solution {
    public int maxProfit(int[] prices) {
        int i = 0;
        int valley = prices[0];
        int peak = prices[0];
        int maxprofit = 0;
        while (i < prices.length - 1) {
            while (i < prices.length - 1 && prices[i] >= prices[i + 1])
                i++;
            valley = prices[i];
            while (i < prices.length - 1 && prices[i] <= prices[i + 1])
                i++;
            peak = prices[i];
            maxprofit += peak - valley;
        }
        return maxprofit;
    }
}
*/
