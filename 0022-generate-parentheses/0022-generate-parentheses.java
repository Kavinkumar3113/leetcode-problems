class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> li=new ArrayList<>();
        String str="";
        int o=0,c=0;
        solve(li,str,o,c,n);
        return li;
    }
    public void solve(List li,String str,int o,int c,int n)
    {
        if(o==n&&c==n)
        {
            li.add(str);
            return;
        }
        if(o<n)
          solve(li,str+"(",o+1,c,n);
        if(o>c)
          solve(li,str+")",o,c+1,n);
    }
}
