class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
       PriorityQueue<Integer> pq1=new PriorityQueue<>();
       int count=0;
       for(int i=0;i<nums1.length;i++){
        if(count%2==0){
            pq1.add(nums1[i]);
            pq.add(pq1.remove());
            count++;
        }else{
            pq.add(nums1[i]);
            pq1.add(pq.remove());
            count++;
        }
       }
       for(int i=0;i<nums2.length;i++){
        if(count%2==0){
            pq1.add(nums2[i]);
            pq.add(pq1.remove());
            count++;
        }else{
            pq.add(nums2[i]);
            pq1.add(pq.remove());
            count++;
        }
       }
       if(count%2==0){
        return (pq.peek()+pq1.peek())/2.0;
       }else{
        return pq.peek()*1.0;
       }  
    }
}
