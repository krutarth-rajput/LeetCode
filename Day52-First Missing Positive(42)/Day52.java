class Solution {
    public int firstMissingPositive(int[] nums) {
       int i=0;
       while(i<nums.length){
        if(nums[i]==i+1){
            i++;
            continue;
        }
        if(nums[i]<1||nums[i]>nums.length){
            i++;
            continue;
        }
        int a=i;
        int b=nums[i]-1;
        if(nums[a]==nums[b]){
            i++;
            continue;
        }
        if(nums[i]>0&&nums[i]<=nums.length){
            int n=nums[i];
            int temp=nums[n-1];
            nums[n-1]=nums[i];
            nums[i]=temp;
        }
       }
       int ans=0;
       for(int j=0;j<nums.length;j++){
        if(nums[j]!=(j+1)){
            return j+1;
        }
       }
       return nums.length+1;
    }
}
