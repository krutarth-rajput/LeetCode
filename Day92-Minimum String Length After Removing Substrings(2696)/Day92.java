class Solution {
    public int minLength(String s) {
        int n=s.length();
        int count=0;
        if(n==1){return 1;}
        Stack<Character> st=new Stack<>();
        for(int i=0;i<n;i++){
            if(st.size()==0){
                st.push(s.charAt(i));
                count++;
            }
            else if(s.charAt(i)=='B'&&st.peek()=='A'){
                st.pop();
                count--;
            }
            else if(s.charAt(i)=='D'&&st.peek()=='C'){
                st.pop();
                count--;
            }else{
                st.push(s.charAt(i));
                count++;
            }
        }
        return count;
    }    
}
