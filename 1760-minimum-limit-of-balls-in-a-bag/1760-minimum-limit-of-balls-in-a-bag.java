class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
      int low=1;
      int high=Arrays.stream(nums).max().getAsInt();
      while(low<high)
      {
        int mid=(low+high)/2;
       int sum=0;
       for(int num:nums)
       {
        sum+=(num-1)/mid;
       }
       if(sum<=maxOperations)
         high=mid;
        else
          low=mid+1;
      }  
      return high;
    }
}