class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat=new int[n][n];
        int steps=n-1;
        int i=1;
        int row=0;
        int col=0;
        if(n==1){
            return new int[][]{{1}};
        }
        while(steps>=1){
            for(int k=0;k<steps;k++){
                mat[row][col]=i;
                i++;
                col++;
            }
            for(int k=0;k<steps;k++){
                mat[row][col]=i;
                i++;
                row++;
            }
            for(int k=0;k<steps;k++){
                mat[row][col]=i;
                i++;
                col--;
            }
            for(int k=0;k<steps;k++){
                mat[row][col]=i;
                i++;
                row--;
            }
            col++;
            row++;
            steps=steps-2;
            if(steps==0){
                mat[row][col]=i;
            }
        }
        return mat;
    }
}
