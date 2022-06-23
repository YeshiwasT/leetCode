class Solution {
    
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] dp=new int[obstacleGrid.length][obstacleGrid[0].length];
       if(obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1]==1)return 0; 
    return   helper(obstacleGrid,0,0,dp);
        
    
    }
    public int helper(int[][] mat,int i,int j,int[][] dp){
        if(i==mat.length||j==mat[0].length)return 0;
        if(i==mat.length-1&&j==mat[0].length-1) return 1;
        if(mat[i][j]==1)return 0;  
        if(dp[i][j]==0)
          return  dp[i][j]= helper(mat,i,j+1,dp)+helper(mat,i+1,j,dp);
     
            return dp[i][j];
      
    }
}