import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix {

    public List<Integer> spiralOrder(int[][] matrix) {
      List<Integer> list=new ArrayList<Integer>();
       int rowStart=0;
        int rowEnd=matrix.length-1;
        int colStart=0;
        int colEnd=matrix[0].length-1;
        int size=(matrix[0].length)*matrix.length;
        while(colStart<=colEnd&&rowStart<=rowEnd){
          
            for(int i=colStart;i<=colEnd;i++){
                if(list.size()==size){
                    break;
                }
                list.add(matrix[rowStart][i]);
            }
                                    rowStart++;

             for(int i=rowStart;i<=rowEnd;i++){
                  if(list.size()==size){
                    break;
                }
                list.add(matrix[i][colEnd]);
            }

            colEnd--;
             for(int i=colEnd;i>=colStart;i--){
                  if(list.size()==size){
                    break;
                }
                list.add(matrix[rowEnd][i]);
            }
             rowEnd--;
               for(int i=rowEnd;i>=rowStart;i--){
                    if(list.size()==size){
                    break;
                }
                list.add(matrix[i][colStart]);
            }
           
            colStart++;
           
            
        }
       
        return list;
    }
}