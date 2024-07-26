class MedianFinder {
    PriorityQueue<Integer> pq1 = new PriorityQueue<>();
    PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());

    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        if(pq1.size()==pq2.size()){
            pq2.add(num);
            pq1.add(pq2.remove());
        }else if(pq1.size()!=pq2.size()){
            pq1.add(num);
            pq2.add(pq1.remove());
        }
    }
    
    public double findMedian() {
        if(pq1.size()==pq2.size()){
            return (pq1.peek()+pq2.peek())/2.0;
        }else{
            return pq1.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
