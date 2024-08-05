class Solution {
    public int lengthOfLastWord(String s) {
        int t=0,l=0;
     for(int i=s.length()-1;i>=0;i--)
     {
           if(l==0&&s.charAt(i)!=' ')
           {
                l=1;
                t=0;
           }
           if(l==1&&s.charAt(i)==' ')
                break;

                t++;
         
     }
      return t;
    }
}