import java.util.HashMap;
import java.util.Map;

import org.xml.sax.HandlerBase;

/*
 * @lc app=leetcode id=56 lang=java
 *
 * [56] Merge Intervals
 */

// @lc code=start
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,new Comparator<int[]>(){
            public int compare(int[] arr1,int[] arr2){
                return arr1[0]-arr2[0];
            }});
        HashMap<Integer,Integer> hm=new HashMap<>();
        int min=intervals[0][0];
        int max=intervals[0][1];
        int c=0;
        for(int a[]:intervals)
        {
            if(a[0]<=max && a[1]>max)
            max=a[1];
            if(a[0]<min)
            min=a[0];
            if(a[0]>max)
            {
                hm.put(min,max);
                min=a[0];
                max=a[1];
                c++;

            }
           
        }
        hm.put(min,max);
        int i=0;
        int arr[][]=new int[c+1][2];
        for(Map.Entry<Integer,Integer> e: hm.entrySet())
        {
            arr[i][0]=e.getKey();
            arr[i][1]=e.getValue();
            i++;
        }
        return arr;
    }
}
// @lc code=end

