class Solution {
    public long coloredCells(int n) {
        if(n==1)
           return 1;
       return (long)2*(n-1)*n+1;
    }
}