public class Spiral_Matrix_II {
    
    public int[][] generateMatrix(int n) {
        int[][] newMatrix=new int[n][n];
        int rowStart=0;
        int rowEnd=newMatrix.length-1;
        int colStart=0;
        int colEnd=newMatrix[0].length-1;
        int start=1;
        while(colStart<=colEnd&&rowStart<=rowEnd){
           for(int i=colStart;i<=colEnd;i++){
                 newMatrix[rowStart][i]=start;
                start++;
            }
            rowStart++;
           for(int i=rowStart;i<=rowEnd;i++){
                newMatrix[i][colEnd]=start;
                 start++;
            }
             colEnd--;
             for(int i=colEnd;i>=colStart;i--){
             newMatrix[rowEnd][i]=start;
                 start++;
            }
             rowEnd--;
               for(int i=rowEnd;i>=rowStart;i--){
               
                newMatrix[i][colStart]=start;
                   start++;
            }
             colStart++;
            
        }
      
        return newMatrix;
    }
}