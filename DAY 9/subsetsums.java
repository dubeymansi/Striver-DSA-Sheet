public class subsetsums {
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n){
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        helper(arr,n,0,0,ans);
        return ans;
        
        
    }
    static void helper(ArrayList<Integer> arr,int n, int idx,int sum,ArrayList<Integer> ans)
    {
        if(idx==n)
        {
        ans.add(sum);
        return;
        }
        helper(arr,n,idx+1,sum+arr.get(idx),ans);
        helper(arr,n,idx+1,sum,ans);
}
