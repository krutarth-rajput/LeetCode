class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int previousValidCount=0;
        int lgei=0;
        int ans=0;
        for(int ep=0;ep<nums.length;ep++){
            if(nums[ep]>right){
                ans=ans+0;
                lgei=ep+1;
                previousValidCount=0;
            }else if(nums[ep]>=left&&nums[ep]<=right){
                ans=ans+(ep-lgei+1);
                previousValidCount=ep-lgei+1;
            }else{
                ans=ans+previousValidCount;
            }
        }
        return ans;
    }
}
