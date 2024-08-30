class Solution {
    public int nextGreaterElement(int n) {
        char[] arr=(n+"").toCharArray();
        int idx=-1;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                idx=i;
                break;
            }
        }
        if(idx==-1){
            return -1;
        }
        char val=arr[idx];
        int idx2=idx+1;
        for(int i=idx+1;i<arr.length;i++){
            if(arr[i]>val&&arr[i]<arr[idx2]){
                idx2=i;
            }
        }

        char temp=arr[idx];
        arr[idx]=arr[idx2];
        arr[idx2]=temp;

        Arrays.sort(arr,idx+1,arr.length);
        long ans=Long.parseLong(new String(arr));
        System.out.print(ans);
        if(ans>=Integer.MIN_VALUE&&ans<=Integer.MAX_VALUE){
            return (int)ans;
        }else {
            return -1;
        }
    }
}

