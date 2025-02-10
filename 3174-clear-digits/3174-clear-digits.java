class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack=new Stack<>();
        int n=s.length();
        char c=' ';
        for(int i=0;i<n;i++)
        {
            c=s.charAt(i);
            if('0'<=c&&c<='9')
                stack.pop();
            else
               stack.push(c);
        }
        s="";
        while(!stack.empty())
            {
                s=stack.pop()+s;
            }
            return s;
    }
}