class Solution {
    int row;
    int column;
    public int uniquePaths(int m, int n) {
        row=m;
        column=n;
        int[][] dp =new int[m][n];
        return   helper(dp,0,0);
    }
    
  public int  helper(int[][] dp,int i,int j){
       if(i==row||j==column)return 0;
        if(i==row-1&&j==column-1)return 1;
        if(dp[i][j]==0){
          return  dp[i][j]= helper(dp,i,j+1)+helper(dp,i+1,j);}
        else{
          return dp[i][j];
           } }
}