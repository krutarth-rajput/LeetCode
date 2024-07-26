class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> al =new ArrayList();
        
        for(int i=0;i<matrix.length;i++){
            int min=Integer.MAX_VALUE;
            int index=0;
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                    index = j;
                }
            }
            int max=Integer.MIN_VALUE;
            for(int j=0;j<matrix.length;j++){
                if(matrix[j][index]>max){
                    max=matrix[j][index];
                }
            }
            
            if(max==min){
                al.add(max);
            }
        }
        return al;
    }
}
