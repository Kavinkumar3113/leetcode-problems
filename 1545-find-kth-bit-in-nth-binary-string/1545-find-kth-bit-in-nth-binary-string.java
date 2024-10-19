class Solution {
    public char findKthBit(int n, int k) {
        
         if(k!=1)
        {
            StringBuilder str=new StringBuilder("0");
            int h=2;
            for(int i=1;i<n;i++)
            {  
                 
                  str.append('1');
                h=str.length();
                for(int j=h-2;j>=0;j--)
                {
                 str.append(str.charAt(j)=='0'?'1':'0');
                  System.out.println(str+"       "+i);
                }
                h=str.length();
                System.out.println(h);
               
                
                
            }
            return str.charAt(k-1);
        }
        return '0';
    }
}