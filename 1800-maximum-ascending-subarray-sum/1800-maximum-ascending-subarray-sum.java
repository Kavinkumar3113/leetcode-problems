class Solution {
    public int maxAscendingSum(int[] nums) {
        int n=nums.length;
        int max=0;
        int sum=nums[0];
        for(int i=1;i<n;i++)
        {
            if(nums[i-1]<nums[i])
               sum+=nums[i];

            else if(sum>max)
               {
                max=sum;
                sum=nums[i];
               }
               else
                sum=nums[i];
           
                
                
        }
        if(sum>max)
             
                max=sum;
        return max;
    }
}