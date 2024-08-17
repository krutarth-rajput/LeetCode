class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int a=nums1.length;
        int b=nums2.length;
        HashSet<Integer> hs=new HashSet<>();
        if(a<b){
            for(int i=0;i<a;i++){
                for(int j=0;j<b;j++){
                    if(nums1[i]==nums2[j]){
                        hs.add(nums1[i]);
                    }
                }
            }
        }else{
            for(int i=0;i<b;i++){
                for(int j=0;j<a;j++){
                    if(nums2[i]==nums1[j]){
                        hs.add(nums2[i]);
                    }
                }
            }

        }
        int counter=0;
        int[] arr=new int[hs.size()];
        for(int val:hs){
            arr[counter]=val;
            counter++;
        }
        return arr;
    }
}
