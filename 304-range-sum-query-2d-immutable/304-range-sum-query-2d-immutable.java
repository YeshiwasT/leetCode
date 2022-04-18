class NumMatrix {
 int[][] twoD;
  int[][] prefix;
    public NumMatrix(int[][] matrix) {

       twoD=matrix;
        prefix=new int[twoD.length][twoD[0].length];
        for(int i=0;i<twoD.length;i++){
                 prefix[i][0]=twoD[i][0];
   
        }
         for(int i=0;i<twoD.length;i++){
            for(int j=1;j<twoD[i].length;j++){
                prefix[i][j]=prefix[i][j-1]+twoD[i][j];
              //  System.out.print(twoD[i][j]);
                 }
           // System.out.println();
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
          
               int result=0;
            while(row1<=row2){
              if(col1==0){
                  result+=prefix[row1][col2];
              }else{
                  result=result+prefix[row1][col2]-prefix[row1][col1-1];

              }
                row1++;
            }
        
        return result;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */