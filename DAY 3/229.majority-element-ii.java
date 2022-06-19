import java.util.ArrayList;
import java.util.List;

import javax.lang.model.element.Element;

/*
 * @lc app=leetcode id=229 lang=java
 *
 * [229] Majority Element II
 */

// @lc code=start
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int check1=nums[0];
        int check2=-1;
        int count1=1;
        int count2=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==check1)
            count1++;
          else  if(nums[i]==check2)
            count2++;
           else  if(count1==0)
            {
                check1=nums[i];
                count1=1;
            }
           else if(count2==0)
            {
                check2=nums[i];
                count2=1;

            }
            else
            {
            count1--;
            count2--;

        }
    }
    count1=0;
    count2=0;
    for(int i=0;i<nums.length;i++)
    {
        if(nums[i]==check1)
        count1++;
        
          else  if(nums[i]==check2)
            count2++;
        }
    
    List<Integer> ans=new ArrayList<>();
    if(count1>nums.length/3)
    ans.add(check1);
    if(count2>nums.length/3)
    ans.add(check2);
    return ans;

    }
}

// @lc code=end

