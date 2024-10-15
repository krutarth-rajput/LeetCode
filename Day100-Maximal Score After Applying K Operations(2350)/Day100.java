class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        long score=0;
        for(int num:nums){
            pq.add(num);
        }
        for(int i=0;i<k;i++){
            int num=pq.remove();
            score+=num;
            if(num%3==0){
                num=num/3;
            }else{num=(num/3)+1;}
            pq.add(num);
        }
        return score;
    }
}
