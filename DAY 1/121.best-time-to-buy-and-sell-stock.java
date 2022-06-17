/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=Integer.MIN_VALUE;
        int min=prices[0];
        for(int i=0;i<prices.length;i++)
        {
            maxProfit=Math.max(maxProfit,prices[i]-min);
            min=Math.min(min,prices[i]);
        }
        return maxProfit;
    }
}
// @lc code=end

