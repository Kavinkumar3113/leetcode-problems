class Solution {
    public int titleToNumber(String columnTitle) {
      StringBuilder sb=new StringBuilder(columnTitle);
      int ans=0;
      int n=sb.length();
      for(int i=0;i<n;i++)
      {
        ans=ans*26+(sb.charAt(i)-64);
      }
      return ans;
    }
}