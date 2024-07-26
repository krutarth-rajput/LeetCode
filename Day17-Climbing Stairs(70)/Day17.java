class Solution {
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        int ans=stairs(dp,n);
        return ans;
        
    }
    public static int stairs(int[] dp,int n){
        if(n==1||n==2){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int x=stairs(dp,n-1);
        int y=stairs(dp,n-2);
        dp[n]=x+y;
        return x+y;
    }
}
