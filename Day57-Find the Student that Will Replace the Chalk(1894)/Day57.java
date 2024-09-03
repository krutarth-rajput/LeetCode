class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int n=chalk.length;
        long total=0;
        for(int i=0;i<n;i++){
            total=chalk[i]+total;
        }
        k=(int)(k%total);
        System.out.print(k);
        for(int i=0;i<n;i++){
            if(chalk[i]<=k){
                k=k-chalk[i];
            }else{
                return i;
                
            }
        }
        return 1;
    }
}
