class Solution {
    public int maximum69Number (int num) {
        int ans=num,t=1,t2=1;
        while(num>0)
        {
        
        if(num%10==6)
           {
            t2*=t;
            t=1;
           }
            t*=10;
            num/=10;
        
        
        }
       
        return t2==1&&ans%10!=6?ans:ans+3*t2;
    }
}