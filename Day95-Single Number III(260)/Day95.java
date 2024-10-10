class Solution {
    public int[] singleNumber(int[] nums) {
        int remain=0;
        for(int i=0;i<nums.length;i++){
            remain=remain^nums[i];
        }
        int idx=0;
        for(int i=0;i<32;i++){
            if(checkBit(remain,i)==true){
                idx=i;
                break;
            }
        }
        int set1=0;
        int set2=0;
        for(int i=0;i<nums.length;i++){
            int arr=nums[i];
            if(checkBit(arr,idx)==true){set1=set1^arr;}
            else{set2=set2^arr;}
        }
        int[] ans=new int[2];
        ans[0]=set1;
        ans[1]=set2;
        return ans;

    }
    public static boolean checkBit(int n,int i){
        if((n&(1<<i))==0){return false;}
        else{return true;}
    }
}
