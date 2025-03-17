class Solution {
    public boolean divideArray(int[] nums) {
        int n=nums.length;
        if(n%2==1)
           return false;
        int arr[]=new int[501];
        for(int i=0;i<n;i++)
        {
            arr[nums[i]]++;
        }
         for(int i=0;i<n;i++)
        {
            if(arr[nums[i]]%2==1)
                return false;
        }
        return true;
    }
}