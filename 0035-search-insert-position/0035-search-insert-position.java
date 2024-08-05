class Solution {
    public int searchInsert(int[] nums, int target) {
        int right=nums.length-1;
        int left=0,mid=0;
        while(left<=right)
        {
            mid=(left+right)/2;
            if(target==nums[mid])
                 return mid;
            else if(left==right&&target>nums[mid])
                return left+1;
           else if(target<nums[mid]){
                     right=mid-1;
           }
           else if(target>nums[mid])
                   left=mid+1;
        } 
        return left;
    }
}