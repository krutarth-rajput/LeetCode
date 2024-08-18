class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int alice=0;
        int bob=0;
        
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i=i+2){
            alice=nums[i];
            bob=nums[i+1];
            arr[i]=bob;
            arr[i+1]=alice;
        }
        return arr;
    }
}
