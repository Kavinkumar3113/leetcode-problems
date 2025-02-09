class Solution {
    public long countBadPairs(int[] nums) {
        int n=nums.length;
        long count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int  diff=0;
        int goodpairs=0;
        for(int i=0;i<n;i++)
        {
          diff=i-nums[i];
          goodpairs=map.getOrDefault(diff,0);
          count+=i-goodpairs;
          map.put(diff,goodpairs+1);

        }
        return count;
    }
}