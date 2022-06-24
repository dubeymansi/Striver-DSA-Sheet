public class number_of_platform {
    class Solution
    {
        //Function to find the minimum number of platforms required at the
        //railway station such that no train waits.
        static int findPlatform(int arr[], int dep[], int n)
        {
            // add your code here
            Arrays.sort(arr);
            Arrays.sort(dep);
            int i=1,j=0,platform=1;
            int result=0,count=1;
            while(i<n && j<n)
            {
                if(arr[i]<=dep[j]) //one more platform needed
            {
                count++;
                i++;
            }
            else //one platform can be reduced
            {
                count--;
                j++;
            }
               result=Math.max(result,count);
            }
          return result;  
        }
        
    } 
}
