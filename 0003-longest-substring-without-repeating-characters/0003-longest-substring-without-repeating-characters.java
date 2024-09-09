class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        String str="";
        if(n==1||n==0)
           return n;
        str+=s.charAt(0);
        int max=0,count=1;
        for(int i=1;i<=n-1;i++)
        {
            if(str.contains(""+s.charAt(i)))
            {

                if(max<count)
                    max=count;
               int d= str.indexOf(s.charAt(i));
               str=str.substring(d+1);
               
                count=str.length();
            }
            str+=s.charAt(i);
            count++;
        }
        if(max<count)
         max=count;
        
        return max;
    }
}