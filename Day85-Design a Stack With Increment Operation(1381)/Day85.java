class CustomStack {
   ArrayList<Integer> al;
    int max;
    public CustomStack(int maxSize) {
        al=new ArrayList<>();
        max=maxSize;
    }
    
    public void push(int x) {
        if(al.size()<max){al.add(x);}
    }
    
    public int pop() {
        if(al.size()>0){
            return al.remove(al.size()-1);
        }
        else{return -1;}
        
    }
    
    public void increment(int k, int val) {
        if(al.size()>=k){
           for(int i=0;i<k;i++){
            int inc=al.get(i);
            al.set(i,inc+val);
           }

        }else{
            for(int i=0;i<al.size();i++){
                int inc=al.get(i);
                al.set(i,inc+val);
            }
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
