class Solution {
    public int minOperations(String[] logs) {
        Stack<Integer> st =new Stack<>();
        int count=0;
        for(int i=0;i<logs.length;i++){
            String sub=logs[i];
            sub=sub.substring(0,2);
            if(logs[i].contains("../")&&st.size()>0){
                st.pop();
            }else if(logs[i].contains("./")){
                continue;
            }else{
                st.push(1);
            }
        }
        return st.size();
    }
}
