class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])==true){
                int temp=hm.get(nums[i]);
                hm.put(nums[i],temp+1);
            }else{
                hm.put(nums[i],1);
            }
        }
        ArrayList<Integer> al=new ArrayList<>();
        for(int val:hm.keySet()){
            if(hm.get(val)==2){
                al.add(val);
            }
        }
        return al;
    }
}
