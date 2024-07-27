class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> al=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        ArrayList<Integer> hs=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])==true){
                int temp=hm.get(nums[i]);
                hm.put(nums[i],temp+1);
            }else{
                hm.put(nums[i],1);
                hs.add(nums[i]);
            }
        }
        
        for(int i=0;i<hs.size();i++){
            int a=hs.get(i);
            if(hm.get(a)>nums.length/3){
                al.add(hs.get(i));
            }
        }
        return al;
    }
}
