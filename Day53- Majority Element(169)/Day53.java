class Solution {
    public int majorityElement(int[] nums) {
        int ele=nums[0];
        int freq=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==ele){
                freq++;
            }else if(nums[i]!=ele&&freq==0){
                ele=nums[i];
                freq=1;
            }else{
                freq-=1;
            }
        }
        return ele;
    }
}
