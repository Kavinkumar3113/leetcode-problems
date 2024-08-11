class Solution {
    public int[] twoSum(int[] nums, int target) {
   
        int array[]=new int[2];
        hes:
        for(int i=1;i<nums.length;i++)
            {
                for(int j=i;j<nums.length;j++)
                {
                    if(nums[j]+nums[j-i]==target)
                    {

                   
                       System.gc();
                        array[0]=j-i;
                        array[1]=j;
                        break hes;
                 
                    }
                }
            }
         return array;
    }
}