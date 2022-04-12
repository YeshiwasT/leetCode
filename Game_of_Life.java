public class Game_of_Life {
    
    public void gameOfLife(int[][] board) {
        int[][] copy=new int[board.length+2][board[0].length+2];
                int[][] board2=new int[board.length][board[0].length];
           for(int i=1;i<board.length;i++){
            for(int j=1;j<board[i].length;j++){
                board2[i][j]=board[i][j];
            }
        }

        for(int i=1;i<=board.length;i++){
            for(int j=1;j<=board[0].length;j++){
                copy[i][j]=board[i-1][j-1];
            }
        }
        
        for(int i=1;i<=board.length;i++){
            for(int j=1;j<=board[0].length;j++){
                     if(copy[i][j]==1&&copy[i][j+1]+copy[i][j-1]+copy[i+1][j]+copy[i-1][j]+copy[i+1][j+1]+copy[i+1][j-1]+copy[i-1][j+1]+copy[i-1][j-1]==2||copy[i][j]==1&&copy[i][j+1]+copy[i][j-1]+copy[i+1][j]+copy[i-1][j]+copy[i+1][j+1]+copy[i+1][j-1]+copy[i-1][j+1]+copy[i-1][j-1]==3){
                    
                    board[i-1][j-1]=1;
                }
                else  if(copy[i][j]==0&&copy[i][j+1]+copy[i][j-1]+copy[i+1][j]+copy[i-1][j]+copy[i+1][j+1]+
                     copy[i+1][j-1]+copy[i-1][j+1]+copy[i-1][j-1]==3){
                    
                    board[i-1][j-1]=1;
                }
              else  if(copy[i][j]==1&&copy[i][j+1]+copy[i][j-1]+copy[i+1][j]+copy[i-1][j]+copy[i+1][j+1]+copy[i+1][j-1]+copy[i-1][j+1]+copy[i-1][j-1]>3){
                    
                    board[i-1][j-1]=0;
                }
             
                  else  if(copy[i][j]==1&&copy[i][j+1]+copy[i][j-1]+copy[i+1][j]+copy[i-1][j]+copy[i+1][j+1]+copy[i+1][j-1]+copy[i-1][j+1]+copy[i-1][j-1]<2){
                    
                    board[i-1][j-1]=0;
                }
                
            }
        }
         for(int i=0;i<copy.length;i++){
            for(int j=0;j<copy[i].length;j++){
                System.out.print(copy[i][j]);
            }
             System.out.println();
        }
        //   for(int i=0;i<board.length;i++){
        //     for(int j=0;j<board[i].length;j++){
        //         board[i][j]=copy[i+1][j+1];
        //     }
        // }
    }
}