class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        int hi=nums.length-3;
        int low=2;
        int ans=0;
        if(nums.length==1){return nums[0];}
        if(nums[0]!=nums[1]){ans= nums[0];}
        if(nums[n-1]!=nums[n-2]){ans= nums[n-1];}
        while(low<=hi){
            int mid=(low+hi)/2;
            if(nums[mid]!=nums[mid-1]&&nums[mid]!=nums[mid+1]){ans= nums[mid];}
            if(nums[mid]==nums[mid-1]){mid--;}
            if(mid%2==0){low=mid+2;}
            else{hi=mid-1;};
        }
    return ans;
    }
}
