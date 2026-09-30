class Solution {
    public int maxProfit(int[] prices) {

        int n = prices.length;
        int minPrice = prices[0];
        int maxProfit = 0;

        for(int i =0; i < n; i++) {

            int cost = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit, cost);
            minPrice = Math.min(minPrice , prices[i]);
        }

        return maxProfit;
    }
}
