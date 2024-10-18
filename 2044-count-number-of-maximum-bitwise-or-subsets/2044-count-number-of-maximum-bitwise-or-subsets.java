class Solution {

    int count=0;
     int maxOr=0;
    public void solve(int arr[],int index,int currentOr)
    {
        if(currentOr==maxOr)
        {
            count++;
            
        }
    
        for(int i=index;i<arr.length;i++)
        {
            solve(arr,i+1,currentOr|arr[i]);
        }

    }
    public int countMaxOrSubsets(int[] nums) {
       
        for(int num:nums)
        {
            maxOr|=num;
        }
        solve(nums,0,0);
        return count;
    }
    
}