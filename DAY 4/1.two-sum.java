import java.util.ArrayList;

/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[]=new int[2];
        int[] nums2 = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums2);
        int start=0;
        int end=nums2.length-1;
        int a=0, b=0;
        while(start<end)
        {
            int sum=nums2[start]+nums2[end];
            if (sum==target)
            {
                a=nums2[start];
                b=nums2[end];
                break;
            }
           else if(sum<target)
                start++;
            else if(sum>target)
                end--;
           
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==a)
            {
                ans[0]=i;
                break;
            }
        }
       if(a != b){
	    		for(int i = 0; i < nums.length; i++){
		    		if(nums[i] == b){
		    			ans[1] = i;
		    			break;
		    		}
		    	}
	    	} else{
	    		for(int i = 0; i < nums.length; i++){
		    		if(nums[i] == b && i != ans[0]){
		    			ans[1] = i;
		    			break;
		    		}
		    	}
	    	}
        return ans;
    }
}
// @lc code=end

