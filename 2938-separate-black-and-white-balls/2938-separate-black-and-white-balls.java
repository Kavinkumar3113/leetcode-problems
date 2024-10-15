class Solution {
    public long minimumSteps(String s) {
        long swap=0;
        int white=0;
        for(int i=s.length()-1;i>-1;i--)
        {
            if(s.charAt(i)=='1')
              swap+=(long)white;
            else
               white++;
        }
        return swap;
    }
}