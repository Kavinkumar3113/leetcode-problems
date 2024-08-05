class Solution {
    public int mySqrt(int x) {
        int l=Integer.MIN_VALUE;
        for(int i=0;i<=x/2;i++)
        {
           if(i*i==x)
           {
              l=i;
              break;
           }
           else if(i*i>x)
            {
               l=i;
               break;
            }
        }
        if(x==1)
          l=1;
        return (int)Math.sqrt(x);
    }
}