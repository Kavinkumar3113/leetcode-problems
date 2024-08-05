class Solution {
    public int removeElement(int[] nums, int val) {
        int l=0,h=0,n=nums.length;
        for(int i=0;i<n;i++)
        {
            h=0;
            if(val==nums[i])
               h=1;      
            if(h==0)
              nums[l++]=nums[i];
        }  
        return l;
    }
}