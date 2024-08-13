class Solution {
    public int romanToInt(String s) {
        int n=s.length(),k=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='I')
               k+=1;
           
            else if(s.charAt(i)=='V')
            {
                if(i!=0&&s.charAt(i-1)=='I')
                   k-=2;
               k+=5;
            }
            else if(s.charAt(i)=='X')
            {
              if(i!=0&&s.charAt(i-1)=='I')
                   k-=2;
               k+=10;
            }
            else if(s.charAt(i)=='L')
            {
                 if(i!=0&&s.charAt(i-1)=='X')
                   k-=20;
               k+=50;
            }
            else if(s.charAt(i)=='C')
            {
                if(i!=0&&s.charAt(i-1)=='X')
                   k-=20;
               k+=100;
            }
            else if(s.charAt(i)=='D')
            {
               if(i!=0&&s.charAt(i-1)=='C')
                  k-=200;
               k+=500;
            }
            else if(s.charAt(i)=='M')
            {
               if(i!=0&&s.charAt(i-1)=='C')
                  k-=200;
               k+=1000;
            }
        }
        return k;
    }
}