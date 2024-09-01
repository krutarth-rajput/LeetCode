class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int ele=m*n;
        if(original.length>ele||original.length<ele){
            return new int[0][0];
        }
        int count=0;
        int[][] arr=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=original[count];
                count++;
            }
        }
        return arr;
    }
}
