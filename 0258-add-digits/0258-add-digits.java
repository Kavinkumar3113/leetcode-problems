class Solution {
    public int addDigits(int num) {
        if(num<10)
            return num;
//         int ans=0;
//         while(num>0)
//         {
            
//         }
        if(num%9==0)
            return 9;
        
        return  num%9;
    }
}