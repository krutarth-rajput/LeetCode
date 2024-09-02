class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int n=chalk.length;
        long[] prefix=new long[n];
        prefix[0]=chalk[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+chalk[i];
        }
        System.out.print(prefix[n-1]);
        while(k>=prefix[n-1]){
            k=k-(int)prefix[n-1];
        }
        
        int idx=-1;
        for(int i=0;i<n;i++){
            if(prefix[i]==k){
                idx=i+1;
            }else if(prefix[i]>k){
                idx=i;
                break;
            }
        }
        return idx;
    }
}
