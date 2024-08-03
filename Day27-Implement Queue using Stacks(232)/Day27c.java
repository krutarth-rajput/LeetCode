class MyQueue {
    Stack<Integer> st=new Stack<>();
    Stack<Integer> st2=new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        if(st.size()==0){
            st.push(x);
        }else{
            while(st.size()!=0){
                st2.push(st.pop());
            }
            st2.push(x);
            while(st2.size()!=0){
                st.push(st2.pop());
            }
        }
    }
    
    public int pop() {
        return st.pop();
    }
    
    public int peek() {
        return st.peek();
    }
    
    public boolean empty() {
        if(st.size()==0){
            return true;
        }else{
           return false;
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */Implement Queue using Stacks
