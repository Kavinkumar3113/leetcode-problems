class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        if(n!=1||n!=0) 
        {
        int k=0,t=0,i=0;
        for(i=1;i<n;i++)
        {
            if(nums[i]==nums[i-1])
            {
                t++;
                if(t==1)
                  nums[k++]=nums[i-1];
                
            }
            else
            {
              t=0;
              nums[k++]=nums[i-1];
            }
        }
         if(t==1)
                  nums[k++]=nums[i-1];
            else
            {
              t=0;
              nums[k++]=nums[i-1];
            }
            return k;
        }
        return n; 
    }
}