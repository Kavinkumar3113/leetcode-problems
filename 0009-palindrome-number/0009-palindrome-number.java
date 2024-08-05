class Solution {
    public boolean isPalindrome(int x) {
        int a=0,b=x;
        while(x!=0)
        {
          a=a*10+x%10;
          x/=10;
        }
        return a==b&&a>=0?true:false;
    }
}