class MinStack {
    Stack<Integer> st=new Stack<>();
    Stack<Integer> st2=new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        int min=val;
        st.push(val);
        if(st2.size()==0){
            st2.push(val);
        }
        else{
            if(st2.peek()<min){
                min=st2.peek();
            }
            st2.push(min);
        }
    }
    
    public void pop() {
        st.pop();
        st2.pop();
        
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return st2.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
