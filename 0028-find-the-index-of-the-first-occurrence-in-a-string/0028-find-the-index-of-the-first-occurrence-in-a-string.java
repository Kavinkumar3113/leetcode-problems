class Solution {
    public int strStr(String haystack, String needle) {
        int l=needle.length();
        int n=haystack.length();
        if(needle.equals(haystack))
        {
            return 0;
        }
        else if(n>1&&l>1)
        for(int i=0;i<=n;i++)
        {
            if(i<=n-l&&(haystack.substring(i,i+l)).equals(needle))
              return i;
           
        }
        else
        {
          for( int i=0;i<n;i++)
          {
            if(haystack.charAt(i)==needle.charAt(0))
              return i;
          }
        }
        
        return -1;
    }
}