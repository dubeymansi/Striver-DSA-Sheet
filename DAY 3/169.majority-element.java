/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        int check=nums[0];
        int count=1;
        for(int i=1; i<nums.length;i++)
        {
            if(nums[i]==check)
            count++;
            else if(nums[i]!=check)
            count--;
            if(count==0)
            {
                check=nums[i];
                count=1;
            }
        }
        return check;
        
    }
}
// @lc code=end

