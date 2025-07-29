class Solution {
    public void rotate(int[][] matrix) {
        //find transpose of matrix
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[i].length;j++){
                int temp = matrix[i][j];
matrix[i][j] = matrix[j][i];
matrix[j][i] = temp;

            }
        }
        //reverse each row of matrix
        for(int i=0;i<matrix.length;i++){
            int k=matrix.length-1;
            int j=0;
            while(j<=k){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][k];
                matrix[i][k]=temp;
                j++;
                k--;
            }
        }
    }
}
