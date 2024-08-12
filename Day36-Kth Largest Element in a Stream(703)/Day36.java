class KthLargest {
    PriorityQueue<Integer> pq=new PriorityQueue<>();
    
    public KthLargest(int k, int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(pq.size()<k){
            pq.add(nums[i]);
        }else if(pq.size()==k){
            if(nums[i]>pq.peek()){
                pq.remove();
                pq.add(nums[i]);
            }
        }
        }
        if(pq.size()<k){
            while(pq.size()!=k){
                pq.add(Integer.MIN_VALUE);
            }
        }
    }
    
    public int add(int val) {
        if(pq.size()>0){
            if(val>pq.peek()){
            pq.remove();
            pq.add(val);
        }
        }else{
            pq.add(val);
        }
        return pq.peek(); 
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
