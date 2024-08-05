class Solution {
    public int singleNumber(int[] nums) {
       int n=nums.length;
        for(int i=1;i<n;i++){
          nums[0]=nums[0]^nums[i];
               
       
    }
     return nums[0];
}
}