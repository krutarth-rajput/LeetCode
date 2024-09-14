class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n=queries.length;
        int[] xor=new int[arr.length];
        xor[0]=arr[0];
        if(arr.length>1){
        for(int i=1;i<arr.length;i++){
            xor[i]=xor[i-1]^arr[i];
        }
        }
        int[] ans=new int[n];
        int counter=0;
        for(int[] q:queries){
            if(q[0]==0){
                ans[counter]=xor[q[1]];
            }else if(q[0]==q[1]){
                ans[counter]=arr[q[0]];
            }else{
                int idx=q[0]-1;
                ans[counter]=(xor[q[1]]^xor[idx]);
            }
            counter++;
        }
        return ans;
    }
}
