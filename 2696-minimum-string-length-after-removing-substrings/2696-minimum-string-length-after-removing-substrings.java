class Solution {
    public int minLength(String s) {
     Stack<Character> stack =new Stack<>();
     int n=s.length();
     for(int i=0;i<n;i++)
     {
        char present_char=s.charAt(i);
        if(stack.isEmpty())
        {
            stack.push(present_char);
        }
        else if(present_char=='B'&&stack.peek()=='A')
        {
            stack.pop();
        }
         else if(present_char=='D'&&stack.peek()=='C')
        {
            stack.pop();
        }
        else
        {
            stack.push(present_char);
        }

     }
     return stack.size();
    }
}