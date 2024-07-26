import java.util.*;
class Solution {
    public int findMaxK(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> hm= new HashMap<>();
        if(n==1){
            return -1;
        }
        for(int i=0;i<n;i++){
            if(hm.containsKey(nums[i])==true){
                int temp=hm.get(nums[i]);
                hm.put(nums[i],temp+1);
            }else{
                hm.put(nums[i],1);
            }
         }

        Arrays.sort(nums);
        int i=nums.length-1;
        while(nums[i]>0){
            int a=nums[i];
            if(hm.containsKey(-a)==true){
                return (nums[i]);
            }
            i--;
            if(i<0){
                return -1;
            }
        }
        return -1;
    }
}
