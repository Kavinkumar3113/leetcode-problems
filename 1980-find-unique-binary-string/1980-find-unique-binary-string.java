class Solution {
    List<String> list=null;
    String ans=null;
    boolean b=false;
    public void solve(int n,String p)
    {
        if(b)
           return;
        if(p.length()==n)
        {
            if(!list.contains(p))
            {
                b=true;
                ans=p;
            }
            return;
        }

        for(int i=0;i<=1;i++)
        {
            solve(n,p+i);
        }
    }
    public String findDifferentBinaryString(String[] nums) {
        list=new ArrayList<>();
    
        int n=nums[0].length();
       
        
        
        for(String s:nums)
        {
          list.add(s);
        }
         solve(n,"");
        return ans;
                   }
}