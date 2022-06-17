import java.util.ArrayList;

/*
 * @lc app=leetcode id=118 lang=java
 *
 * [118] Pascal's Triangle
 */

// @lc code=start
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        int val=0;
        for(int i=0;i<numRows;i++)
        {
            ans.add(new ArrayList<>());
            for(int j=0;j<=i;j++)
            {
                if(i==0||j==0 ||i==j)
                ans.get(i).add(1);
                else
                {
                    val=ans.get(i-1).get(j-1)+ans.get(i-1).get(j);
                  ans.get(i).add(val);
                }
               
            }
        }
        return ans;
    }
}
// @lc code=end

