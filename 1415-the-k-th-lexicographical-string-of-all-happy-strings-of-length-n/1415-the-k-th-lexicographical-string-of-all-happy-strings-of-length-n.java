class Solution {
    List<String> list=new ArrayList<>();
    
    public void solve(int n,String s,int k)
    {
       if(s.length()==n)
          {
            list.add(s);
            return;
          }
        if(list.size()==k)
        return;
        for(char c='a';c<='c';c++)
        {
            int v=s.length();
            if(v>0 &&
               s.charAt(v-1)==c)
               continue;
               solve(n,s+c,k);
        }
    }
    public String getHappyString(int n, int k) {
        solve(n,"",k);
        if(list.size()<k)
        return "";
        return list.get(k-1);
    }
} 