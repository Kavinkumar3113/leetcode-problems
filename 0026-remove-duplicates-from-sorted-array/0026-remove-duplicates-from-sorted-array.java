class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length,l=0,h=0;
         
         for(int i=0;i<n;i++)
         {
            h=0;
            for(int j=i-1;j>=0;j--)
            {
                if(nums[i]==nums[j])
                   h=1;
            }
            
            if(h!=1)
              nums[l++]=nums[i];
         }
         return l;
        
    }
}