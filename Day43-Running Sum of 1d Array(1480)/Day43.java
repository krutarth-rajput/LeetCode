class Solution {
    public int[] runningSum(int[] nums) {
        int[] prefix=new int[nums.length];
        prefix[0]=nums[0];
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            sum+=nums[i];
            prefix[i]=sum;
        }
        return prefix;
    }
}
