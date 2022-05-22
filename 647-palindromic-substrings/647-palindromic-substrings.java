class Solution {
    //dp solution
    public int countSubstrings(String s) {
        int count=0;
        
    int[][] dp=new int[s.length()][s.length()];
        
        for(int i=0,j=0;i<s.length();j++,i++){
            count++;
            dp[i][j]=1;
        }
        for(int i=1;i<s.length();i++)
        {
            for(int j=0;j<i;j++){
                if(s.charAt(i)==s.charAt(j)&&Math.abs(i-j)==1){
                    count++;
                    dp[j][i]=1;
                }
                else if(dp[j+1][i-1]==1&&s.charAt(i)==s.charAt(j)){
                    count++;
                    dp[j][i]=1;
                }
                else{
                    dp[j][i]=0;
                }
            }
            
        }
        
        
        return count;
    }
}
