class Solution {
    public String longestCommonPrefix(String[] strs) {
        int k=strs.length,l=1000,o=0;
         String g="",s="",l1="",l2="";
        for(int i=0;i<k;i++)
        {
          if(strs[i].length()<l)
          {
            l=strs[i].length();
             s=strs[i];
          }
        }
        
        for(int i=0;i<=l;i++)
         {
            
            int t=0;
               l2=s.substring(0,i);
            for(int j=0;j<k;j++)
            {
                
                l1=strs[j].substring(0,i);
                 
               if(l1.equals(l2))
                   t++;
            }
            if(t==k)
             g=s.substring(0,i);
         }
        return g;
    }
}