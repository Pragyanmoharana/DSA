class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       int m=matrix.length;
       int n=matrix[0].length; 
       List<Integer> result=new ArrayList<Integer>();
       int dir=0;
       int top=0;
       int down=m-1;
       int left=0;
       int right=n-1;

       while(top<=down && left<=right){
        //dir=0
        //left to right
        //constanthere is row (top)
        if(dir==0){
         for(int i=left;i<=right;i++){
            result.add(matrix[top][i]);
        }
        top++;
        }
      
        if(dir==1){
            //top to down//right constn
            for(int i=top;i<=down;i++){
                result.add(matrix[i][right]);
            }
            right--;
        } 

        
        if(dir==2){
            //righ to left//downcontant
            for(int i=right;i>=left;i--){
                result.add(matrix[down][i]);
            }
           down--;
        } 

     
        if(dir==3){
            // down to top//left constant
            for(int i=down;i>=top;i--){
              result.add(matrix[i][left]);

            }
            left++;
        }
      dir++;
      if(dir==4){
        dir=0;
      }

       }
       return result;


    }
}
