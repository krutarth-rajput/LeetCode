class MyStack {
    Queue<Integer> q=new LinkedList<>();
    Queue<Integer> q2=new LinkedList<>();
    int flip=0;
    public MyStack() {
        
    }
    
    public void push(int x) {
        q.add(x);
        flip=0;
    }
    
    public int pop() {
        if(flip==1){
            flip=0;
            return q.remove();
        }else{
            while(q.size()!=1){
            q2.add(q.remove());
        }
        while(q2.size()!=0){
            q.add(q2.remove());
        }
        return q.remove();
        }
        
    }
    
    public int top() {
        if(flip==1){
            return q.peek();
        }
        while(q.size()!=1){
            q2.add(q.remove());
        }
        while(q2.size()!=0){
            q.add(q2.remove());
        }
        flip=1;
        return q.peek();
    }
    
    public boolean empty() {
        if(q.size()==0){
            return true;
        }else{
            return false;
        }
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
