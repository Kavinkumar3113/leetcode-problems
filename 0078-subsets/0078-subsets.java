class Solution {
    public void solve(List<List<Integer>> l2,List<Integer> l,int[] nums,int i)
    {
        if(i==nums.length)
           l2.add(new ArrayList<>(l));
        else
        {
            l.add(nums[i]);
            solve(l2,l,nums,i+1);
            l.remove(l.size()-1);
            solve(l2,l,nums,i+1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> l2=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        solve(l2,l,nums,0);
        return l2;

    }
}