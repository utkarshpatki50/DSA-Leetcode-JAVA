class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0, minPrice = prices[0];

        for (int i = 0; i < n; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            }
        }
        return maxProfit;
    }
}