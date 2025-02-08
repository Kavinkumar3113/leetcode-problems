class Solution {
    public boolean check(int[] nums) {
        int n=nums.length,c=0;
        for(int i=1;i<n;i++)
        {
           if(nums[i-1]<=nums[i])
                 {}
           else
           {
            c++;
            if( nums[n-1]<=nums[0])
             {
                
             }
              else 
             return false;
       if(c>1)
          return false;
           
         
        }
        }
        return true;
    }
}