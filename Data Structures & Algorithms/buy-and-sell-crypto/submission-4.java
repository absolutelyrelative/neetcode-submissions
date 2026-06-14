class Solution {
    public int maxProfit(int[] prices) {
        int left = 0, right = 1;
        int profit = 0;

        // [5,1,5,6,7,1,10]
        //      L R
        for(right = 1; right < prices.length; right++) {
            if(prices[left] < prices[right]) {
                // Profit
                profit = Math.max(profit, prices[right] - prices[left]);
            } else {
                left++;
                right = left;
            }
        }

        return profit;
    }
}
