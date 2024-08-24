class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            int[] arr=matrix[i];
            int s=0;
            int e=n-1;
            while(s<e){
                int temp2=arr[s];
                arr[s]=arr[e];
                arr[e]=temp2;
                s++;
                e--;
            }
        }
    }
}
