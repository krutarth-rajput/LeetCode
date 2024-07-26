class Solution {
  public long maximumHappinessSum(int[] happiness, int k) {
    long ans=0;
    int n=happiness.length;
    int minus=0;
    Arrays.sort(happiness);
    for(int i=n-1;i>n-1-k;i--){
        if((happiness[i]-minus)>0){
        ans=ans+(happiness[i]-minus);
        }else{
            ans=ans+0;
        }
        minus++;
    }
    return ans;
}
}
