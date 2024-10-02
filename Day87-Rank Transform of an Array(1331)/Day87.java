class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] clone=arr.clone();
        Arrays.sort(clone);
        HashMap<Integer,Integer> hm=new HashMap<>();
        int rank=1;
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(clone[i])==false){
                hm.put(clone[i],rank);
                rank++;
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=hm.get(arr[i]);
        }
        return arr;
    }
}
