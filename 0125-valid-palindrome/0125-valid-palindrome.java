class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int n=s.length();
        String l="";
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='0'&&s.charAt(i)<='9')
                l+=s.charAt(i);
        }
       n=l.length();
        for(int i=0;i<n;i++)
        {
            if(l.charAt(i)!=l.charAt(--n))
               return false;
        }
      
   return true;
    }
}