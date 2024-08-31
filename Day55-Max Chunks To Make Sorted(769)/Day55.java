class Solution {
    public int maxChunksToSorted(int[] arr) {
        int count=0;
        int max=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==i){
                count++;
            }else{
                max=arr[i];
                while(i!=max){
                    i++;
                    if(arr[i]>max){
                        max=arr[i];
                    }    
                }
                count++;
            }
        }
        return count;
    }
}
