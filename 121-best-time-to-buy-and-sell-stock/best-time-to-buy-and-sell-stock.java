class Solution {
    public int maxProfit(int[] prices) {
        // Initialize minPrice to a very large value and maxProfit to 0
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        // Loop through each price in the prices array
        for (int i = 0; i < prices.length; i++) {
            // If the current price is less than minPrice, update minPrice
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            // Calculate the current profit and update maxProfit if it's greater than the previous maxProfit
            else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        
        return maxProfit;
    }
}
