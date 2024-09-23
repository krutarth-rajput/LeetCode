class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] ans=new int[2];
        int count=0;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(hs.contains(nums[i])==true){
                ans[count]=nums[i];
                count++;
            }else{hs.add(nums[i]);}
            if(count==2){break;}
        }
        return ans;
    }
}
