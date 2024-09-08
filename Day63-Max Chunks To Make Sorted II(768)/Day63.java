class Solution {
    public int maxChunksToSorted(int[] arr) {
    int n=arr.length;
    int count=0;
    int[] pmax=prefixm(arr);
    int[] smax=suffixm(arr);
    for(int i=0;i<n-1;i++){
        if(pmax[i]<=smax[i+1]){
            count++;
        }
    }
    count++;
    return count;
    }
    public static int[] prefixm(int[] arr){
        int n=arr.length;
        int[] pmax=new int[n];
        pmax[0]=arr[0];
        for(int i=1;i<n;i++){
            pmax[i]=Math.max(pmax[i-1],arr[i]);
        }
        return pmax;
    }

    public static int[] suffixm(int[] arr){
        int n=arr.length;
        int[] smax=new int[n];
        smax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            smax[i]=Math.min(smax[i+1],arr[i]);
        }
        return smax;
    }
}
