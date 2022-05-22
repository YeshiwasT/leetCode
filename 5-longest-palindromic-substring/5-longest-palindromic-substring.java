class Solution {
    public String longestPalindrome(String s) {
        int min=1;
        int start=0;
        int end=0;
        int[][] dp=new int[s.length()][s.length()];
        for(int i=0,j=0;i<s.length();i++,j++){
            dp[i][j]=1;
        }
        for(int i=1;i<s.length();i++){
            for(int j=0;j<i;j++){
                if(s.charAt(i)==s.charAt(j)&&Math.abs(i-j)==1){
                    dp[j][i]=1;
                    int res=i-j+1;
                     if(res>min){
                       start=j;
                       end=i;
                       min=res; }  }
                else if(s.charAt(i)==s.charAt(j)&&dp[j+1][i-1]==1){
                    dp[j][i]=1;
                    int res=i-j+1;
                      if(res>min){
                       start=j;
                       end=i;   
                       min=res; } }
                else{
                      dp[j][i]=0;
                  }
            }
        }
       return s.substring(start,end+1) ;
    }
}