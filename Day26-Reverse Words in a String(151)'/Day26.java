class Solution {
    public String reverseWords(String s) {
        String ans="";
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                while(s.charAt(i)==' '){
                    if(i==0){
                        break;
                    }
                i--;
            }
            }
            Stack<Character> st=new Stack<>();
            while(s.charAt(i)!=' '){
                st.push(s.charAt(i));
                if(i==0){
                    break;
                }
                i--;
                }
                int size=st.size();
                for(int k=0;k<size;k++){
                    ans=ans+st.pop();
                }

                System.out.println(i);
                
                    if(i>0){
                        ans=ans+' ';
                        
                    }
    }
    int space=ans.length()-1;
    while(ans.charAt(space)==' '){
        space--;
    }
    String g=ans.substring(0,space+1);
    return g;
    }
}
