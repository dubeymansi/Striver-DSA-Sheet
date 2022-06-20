/*
 * @lc app=leetcode id=128 lang=java
 *
 * [128] Longest Consecutive Sequence
 */

// @lc code=start
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> s=new HashSet<>();
        for(int a:nums)
        s.add(a);
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            if(!s.contains(nums[i]-1))
            {
               int cnum=nums[i];
               int ccount=1;
               while(s.contains(cnum+1))
               {
                cnum+=1;
                ccount+=1;
               }
                  ans=Math.max(ans,ccount);
            }
        }
        return ans;
    }
}
// @lc code=end

