class Solution {
    public int maxProduct(int[] nums) {
        double l=1;
        double r=1;
        double ans=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(l==0)
                l=1;
            if(r==0)
                r=1;
            l=l*nums[i];
            r=r*nums[nums.length-i-1];
            if(l<r)
            {
                if(ans<r)
                    ans=r;
            }
            else
            {
                if(ans<l)
                    ans=l;
            }
        }
        return (int)ans;
    }
}