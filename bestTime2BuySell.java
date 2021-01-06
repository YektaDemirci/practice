/* Very smart solution*/
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int profit=0;
        for(int i=0; i<prices.length; i++) {
            if(prices[i]<minPrice)
                minPrice = prices[i];
            else if(prices[i]-minPrice > profit)
                profit = prices[i]-minPrice;
        }
        return profit;
    }
}

/*Brute force 
class Solution {
    public int maxProfit(int[] prices) {
        int ans=0;
        for(int i=prices.length-1; i>0; i--) {
            for(int j=i-1; j>=0; j--) {
                if(prices[i]-prices[j] > ans) ans=prices[i]-prices[j];
            }
        }
        return ans;
    }
}
*/
