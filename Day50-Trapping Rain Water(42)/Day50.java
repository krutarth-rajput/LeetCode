class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] prefix=fix1(height);
        
        int[] suffix=fix2(height);
        int water=0;
        for(int i=1;i<n-1;i++){
            int lb=prefix[i-1];
            int rb=suffix[i+1];
            int yb=Math.min(lb,rb);
            int contri=yb-height[i];
            if(contri>0){
                water=water+contri;
            }
        }
        return water;
    }
    public static int[] fix1(int[] arr){
        int n=arr.length;
        int[] nums=new int[n];
        nums[0]=arr[0];
        for(int i=1;i<n;i++){
            nums[i]=Math.max(nums[i-1],arr[i]);
            
        }
        return nums;
    }
    public static int[] fix2(int[] arr){
        int n=arr.length;
        int[] nums=new int[n];
        nums[n-1]=arr[n-1];
        
        for(int i=n-2;i>=0;i--){
            nums[i]=Math.max(nums[i+1],arr[i]);
            
        }
        return nums;
    }
}
