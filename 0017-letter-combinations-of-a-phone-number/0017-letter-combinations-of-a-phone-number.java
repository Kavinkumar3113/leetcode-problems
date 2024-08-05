class Solution {
    List<String> l=new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        String s[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        String v="";
        if(digits.length()==0) return l;
        help(s,0,digits,v);
        return l;
    }
    void help(String s[],int k,String d,String v){
        if(k==d.length()){
        l.add(v);
        return;
        }
        String g=s[Character.getNumericValue(d.charAt(k))];
        for(int i=0;i<g.length();i++){
         help(s,k+1,d,v+g.charAt(i));
        }

    }
}