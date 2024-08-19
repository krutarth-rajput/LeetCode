class NumArray {
    ArrayList<Integer> al=new ArrayList<>();
    public NumArray(int[] nums) {
        al.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            al.add(al.get(i-1)+nums[i]);
        }
        
    }
    
    public int sumRange(int left, int right) {
        if(left>0){
            return al.get(right)-al.get(left-1);
        }else{
            return al.get(right);
        }

    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
