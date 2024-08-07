class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        ArrayList<Integer> al=new ArrayList<>();
        int[] arr=new int[queries.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==x){
                al.add(i);
            }
        }

        
       
        for(int i=0;i<queries.length;i++){
            if(queries[i]<=al.size()){
                arr[i]=al.get(queries[i]-1);
            }else{
                arr[i]=-1;
            }
        }
        return arr;
    }
}
