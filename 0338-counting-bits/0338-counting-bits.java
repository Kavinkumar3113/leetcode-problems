class Solution {
    public int[] countBits(int n) {
        int arr[]=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            String s=Integer.toBinaryString(i);
            arr[i]=s.length()-s.replace("1","").length();
        }
        return arr;
    }
}