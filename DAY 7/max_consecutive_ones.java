public class max_consecutive_ones {
    class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            if(nums.length==0)
                return 0;
          int max=0;
            max= numberOfOnes(nums,max);
            return max;
            
        }
        static int numberOfOnes(int nums[],int max)
        {
            if(nums.length==0)
                return 0 ;
                       int curmax=0;
            for(int i=0;i<nums.length;i++)
            {
               
                if(nums[i]==1)
                {
                    curmax+=1;
                    max=Math.max(curmax,max);
                }
                else if(nums[i]==0)
                {
                    curmax=0;
                    
                }
            }
            return max;
        }
            
    }
}
