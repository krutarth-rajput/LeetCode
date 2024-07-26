import java.util.*;
class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();
         
         for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                String a="";
                while(st.peek()!='('){
                a=a+st.pop();
                }
                st.pop();
                for(int j=0;j<a.length();j++){
                    st.push(a.charAt(j));
                }
            }else{
            st.push(s.charAt(i));
         }
         }
         String ans="";
         while(st.size()>0){
            ans=ans+st.pop();
         }
        StringBuilder sb=new StringBuilder(ans);  
        sb.reverse();  
        return sb.toString(); 
      
       
    }        
}
