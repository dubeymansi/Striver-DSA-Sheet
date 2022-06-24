class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        Arrays.sort(arr,(a,b)->b.profit-a.profit);
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            max=Math.max(max,arr[i].deadline);
        }
        int result[]=new int[max+1];
        int profit=0,count=0;;
        Arrays.fill(result,-1);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=arr[i].deadline;j>0;j--)
            {
                if(result[j]==-1)
                {
                    count++;
                    profit+=arr[i].profit;
                    result[j]=i;
                    break;
                }
            }
        }
        int ans[]=new int[2];
        ans[0]=count;
        ans[1]=profit;
        return ans;
    }
}

/*
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
*/