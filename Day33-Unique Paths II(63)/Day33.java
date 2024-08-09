class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid[0][0]==1){return 0;}
        int[][] dp=new int[obstacleGrid.length][obstacleGrid[0].length];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        int ans=unique(dp,obstacleGrid.length-1,obstacleGrid[0].length-1,obstacleGrid);
        return ans;
    }
    public static int unique(int[][] dp,int i,int j,int[][] ob){
        if(i<0||j<0){
            return 0;
        }
        if(i==0&&j==0){
            return 1;
        }
        if(ob[i][j]==1){return 0;}
        if(dp[i][j]!=-1){return dp[i][j];}
        int a=unique(dp,i-1,j,ob);
        int b=unique(dp,i,j-1,ob);
        dp[i][j]=a+b;
        return a+b;
    }
}
