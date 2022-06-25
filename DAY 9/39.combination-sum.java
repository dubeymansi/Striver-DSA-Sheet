/*
 * @lc app=leetcode id=39 lang=java
 *
 * [39] Combination Sum
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
       subset(0,candidates,target,new ArrayList<>(),ans);
        return ans;
        
    }
    static void subset(int idx,int candidates[],int target,List<Integer> ds,List<List<Integer>> ans)
    {
        if(idx==candidates.length)
        {
        if(target==0)
        {
            ans.add(new ArrayList<Integer>(ds));
        }
            return;
        }
        if(candidates[idx]<=target)
        {
            ds.add(candidates[idx]);
        subset(idx,candidates,target-candidates[idx],ds,ans);
        ds.remove(ds.size()-1);
        }
        subset(idx+1,candidates,target,ds,ans);
    }
}
// @lc code=end

