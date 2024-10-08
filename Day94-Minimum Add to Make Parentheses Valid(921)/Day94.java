class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(st.size()==0){st.push(s.charAt(i));}
            else if(s.charAt(i)==')'&&st.peek()=='('){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
        }
        return st.size();
    }
}
