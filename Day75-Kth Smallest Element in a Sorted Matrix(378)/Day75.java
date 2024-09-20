class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int[] arr:matrix){
            for(int ele:arr){pq.add(ele);}    
        }
        for(int i=pq.size();i>k;i--){
            pq.remove();
        }
        return pq.peek();
    }
}
