class Solution {
    public int findDuplicate(int[] nums) {
        int ans=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])==true){
                int temp=hm.get(nums[i]);
                hm.put(nums[i],temp+1);
            }else{
                hm.put(nums[i],1);
            }
        }
        for(int val:hm.keySet()){
            if(hm.get(val)>=2){
                ans=val;
                break;
            }
        }
        return ans;
    }
}
