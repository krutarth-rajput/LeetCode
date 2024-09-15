class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int maxbitwise=nums[0];
        int max=1;A
        int ans=1;
        if(nums.length==1){
            return 1;
        }
        for(int i=1;i<n;i++){
            if(nums[i]>maxbitwise){
                maxbitwise=nums[i];
                ans=1;
                max=1;   
            }
            else if(nums[i]==maxbitwise){
                ans++;    
            }else if(nums[i]!=maxbitwise){
                ans=0;
            }
            max=Math.max(ans,max);
            
        }
        return max;
    }
}
