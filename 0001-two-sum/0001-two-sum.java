class Solution {
    public int[] twoSum(int[] nums, int target) {
   
        int array[]=new int[2];
        hes:
        for(int i=0;i<nums.length;i++)
            {
                for(int j=1;j<nums.length;j++)
                {
                    if(nums[i]+nums[j]==target)
                    {

                    if(i!=j)
                    {
                        array[0]=i;
                        array[1]=j;
                        break hes;
                    }
                    }
                }
            }
         return array;
    }
}