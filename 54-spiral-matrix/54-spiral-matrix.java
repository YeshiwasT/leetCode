class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new LinkedList<>();
       int startCol=0;
        int startRow=0;
        int size=(matrix[0].length)*matrix.length;
        int endCol=matrix[0].length-1;
        int endRow=matrix.length-1;
        while(startCol<=endCol&&startRow<=endRow){
            int j=startCol;
            while(j<=endCol){
                   if(list.size()==size){
                    break;
                }
                list.add(matrix[startCol][j]);
                j++;
            }
            startRow++;
            int i=startRow;
            while(i<=endRow){
                 if(list.size()==size){
                    break;
                }
                list.add(matrix[i][endCol]);
                i++;
            }
            endCol--;
                j=endCol;
            while(j>=startCol){
                 if(list.size()==size){
                    break;
                }
                list.add(matrix[endRow][j]);
                j--;
            }
            
            endRow--;
            j=endRow;
            while(j>=startRow){
                 if(list.size()==size){
                    break;
                }
                list.add(matrix[j][startCol]);
                j--;
            }
            startCol++;
            
        }
           
       
        
return list;
}}