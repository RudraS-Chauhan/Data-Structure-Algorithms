class Solution {
    public int maxProfit(int[] prices) {
       int profit = 0;
       int min1 = prices[0];

       for(int i =0; i<prices.length; i++) 
       {
            min1 = Math.min(min1, prices[i]);
            profit = Math.max(profit, prices[i]-min1);

       }
       return profit;
    }
}