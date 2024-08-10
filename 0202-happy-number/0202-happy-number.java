class Solution {
    public int sqt(int n)
    {
        int t=0,m=0;
        while(n!=0)
        {
         m=n%10;
         t+=m*m;
         n/=10;
        }
        return t;
    }
    public boolean isHappy(int n) {
          int s=sqt(n),f=sqt(sqt(n));
          
          while(s!=f&&f!=1)
          {
            s=sqt(s);
            f=sqt(sqt(f));
          }
          return f==1;
    }
}