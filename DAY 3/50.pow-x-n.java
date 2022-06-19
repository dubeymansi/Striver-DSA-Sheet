/*
 * @lc app=leetcode id=50 lang=java
 *
 * [50] Pow(x, n)
 */

// @lc code=start
class Solution {
    public double myPow(double x, int m) {
        if(m==0)
        return 1;
        double temp=Math.pow(x,m/2);
        if(m%2==0)
        return temp*temp;
        else 
        {
        if(m > 0)
            return x*temp*temp;
        else
            return (temp*temp)/x;
    }
}
}
// @lc code=end

