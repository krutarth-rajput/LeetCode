class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        List<Integer> al=new ArrayList<>();
        int i=0;
        int j=0;
        int rsteps=n-1;
        int csteps=m-1;
        while(rsteps>=1&&csteps>=1){
            for(int k=0;k<csteps;k++){
                al.add(matrix[i][j]);
                j++;
            }
            for(int k=0;k<rsteps;k++){
                al.add(matrix[i][j]);
                i++;
            }
            for(int k=csteps;k>=1;k--){
                al.add(matrix[i][j]);
                j--;
            }
            for(int k=rsteps;k>=1;k--){
                al.add(matrix[i][j]);
                i--;
            }
            i++;
            j++;
            rsteps=rsteps-2;
            csteps=csteps-2;;
        }
        if(rsteps==0){
                for(int k=0;k<csteps+1;k++){
                    al.add(matrix[i][j]);
                    j++;
            }
            }else if(csteps==0){
                for(int k=0;k<rsteps+1;k++){
                    al.add(matrix[i][j]);
                    i++;
            }
            }
        return al;
    }
}
