class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int[] ans=new int[m*n];
        int count=0;
        int flip=0;
        int i=0;
        int j=0;
        while(count<m*n){
            if(flip==0){
                while(i>=0&&j<n){
                    ans[count]=mat[i][j];
                    i--;
                    j++;
                    count++;
                }
                i++;
                j--;
                if(j+1<n){j++;}
                else{i++;}
                flip=1;
            }else{
                while(i<m&&j>=0){
                    ans[count]=mat[i][j];
                    i++;
                    j--;
                    count++;
                }
                i--;
                j++;
                if(i+1<m){i++;}
                else{j++;}
                flip=0;
            }
        }
        return ans;
    }
}
