class Solution {
    public String shortestPalindrome(String s) {
        StringBuilder ss=new StringBuilder(s);
        ss.reverse();
        for(int i=0;i<s.length();i++)
        {
            if(s.startsWith(ss.substring(i)))
            {
                return ss.substring(0,i)+s;
            }
        }
        return "";

    }
}