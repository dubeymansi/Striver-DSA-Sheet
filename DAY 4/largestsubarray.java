public class largestsubarray 
   {
    int maxLen(int arr[], int n)
    {
        // Your code here
        HashMap<Integer,Integer> hm=new HashMap<>();
        int max=0;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            if(sum==0)
            max=Math.max(max,i+1);
            else
            {
                if(hm.containsKey(sum)==true)
                {
                    max=Math.max(max,i-hm.get(sum));
                }
                else
                hm.put(sum,i);
        }
    }
    return max;
    }
}

