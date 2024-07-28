class Solution {
    public void sortColors(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=1;j<nums.length;j++){
                if(nums[j-1]>nums[j]){
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
        }   
    }
}
