//METHOD 1

//using Binary Search 
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         int rows=matrix.length;
        int col=matrix[0].length;
        int n=rows*col;
         int s=0;
        int e=n-1;
        int mid=s+(e-s)/2;
        while(s<=e){
            int rowIndex=mid/col;
            int colIndex=mid%col;
            if(matrix[rowIndex][colIndex]==target){
                return true;
            }
            else if(target<matrix[rowIndex][colIndex]){
               
                 e=mid-1;
            }
            else{
                s=mid+1;
            }
             mid=s+(e-s)/2;
            
        }
       return false;
    }
}


// METHOD  2
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int i=0;
        int j=n-1;
       while (i < m && j >= 0){
         if(matrix[i][j]>target){
            j--;
         }
         else if(matrix[i][j]<target){
            i++;
         }
         else{
            return true;
         }
       }
       return false;

    }
}
