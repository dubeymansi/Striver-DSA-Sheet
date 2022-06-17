/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        int csum=nums[0];
        int maxsum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(csum>=0)
            csum+=nums[i];
            else
            csum=nums[i];
            if(csum>maxsum)
maxsum=csum;
        }
        return maxsum;
        
    }
}
// @lc code=end

