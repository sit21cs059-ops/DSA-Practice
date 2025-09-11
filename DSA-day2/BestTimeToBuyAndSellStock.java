
public class BestTimeToBuyAndSellStock {

    static class Solution {
        public int maxProfit(int[] prices) {
            int min = Integer.MAX_VALUE;
            int max = 0;

            for (int i = 0; i < prices.length; i++) {
                if (prices[i] < min) {
                    min = prices[i]; // update min price
                } else if (prices[i] - min > max) {
                    max = prices[i] - min; // update max profit
                }
            }
            return max;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit (Test 1): " + sol.maxProfit(prices1)); // Expected 5

        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Max Profit (Test 2): " + sol.maxProfit(prices2)); // Expected 0

        int[] prices3 = {2, 4, 1};
        System.out.println("Max Profit (Test 3): " + sol.maxProfit(prices3)); // Expected 2
    }
}
