class Solution {
    int[] dp=new int[38];
    public int tribonacci(int n) {
        dp[0]=0;
        dp[1]=1;
        dp[2]=1;
        if(n<=0)return n;
        if(dp[n]!=0)
        {
            return dp[n];
        }
        return dp[n]=tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
    }
}