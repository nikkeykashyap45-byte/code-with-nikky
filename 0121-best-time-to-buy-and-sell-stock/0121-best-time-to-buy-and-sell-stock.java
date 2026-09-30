class Solution {
    public int maxProfit(int[] prices) {
        int minprices = prices[0];
        int maxprofit = 0;
        for(int i=1;i<prices.length;i++){
            int profit = prices[i] - minprices;
            maxprofit = Math.max(maxprofit,profit);
            minprices = Math.min(minprices,prices[i]);
        }
        return maxprofit;
    }
}