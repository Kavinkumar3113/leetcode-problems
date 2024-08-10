class Solution {
    public int addDigits(int num) {
        int t=0;
        while(num!=0)
        {
           t+=num%10;
           num/=10;
        }
        if(t>9)
          return addDigits(t);
        return t;
    }
}