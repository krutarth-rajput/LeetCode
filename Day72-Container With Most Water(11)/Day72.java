class Solution {
    public int maxArea(int[] height) {
        int p1=0;
        int p2=height.length-1;
        int maxWater=0;
        while(p1<p2){
            int heights=Math.min(height[p1],height[p2]);
            int width=p2-p1;
            int water=heights*width;
            maxWater=Math.max(water,maxWater);
            if(height[p1]<height[p2]){p1++;}
            else{p2--;}
        }
        return maxWater;
    }
}
