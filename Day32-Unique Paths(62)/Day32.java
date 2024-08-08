class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        for(int[] row:dp){
        Arrays.fill(row,-1);
        }
        int ans=unique(dp,m-1,n-1);
        return ans;
        
    }
    public static int unique(int[][] dp,int i,int j){
        if(i<0||j<0){
            return 0;
        }
        if(i==0&&j==0){
            return 1;
        }
        if(dp[i][j]!=-1){return dp[i][j];}
        int a=unique(dp,i-1,j);
        int b=unique(dp,i,j-1);
        dp[i][j]=a+b;
        return a+b;
    }
}
