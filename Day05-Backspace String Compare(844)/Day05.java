class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1=new Stack<>();
        Stack<Character> st2=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#'){
                if(st1.size()>0){
                    st1.pop();
                }
            }else{
                st1.push(s.charAt(i));
            }
        }
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)=='#'){
                if(st2.size()>0){
                    st2.pop();
                }
            }else{
                st2.push(t.charAt(i));
            }
        }
        if(st1.size()!=st2.size()){
            return false;
        }else{
            while(st2.size()!=0){
                if(st1.peek()==st2.peek()){
                    st1.pop();
                    st2.pop();
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}
