class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length,ans=0;
        for(int i=0;i<n;i++)
        {
           ans+=(i+1-nums[i]);
            System.out.println(ans);
        }
        return ans;
    }
}