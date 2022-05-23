class Solution {
    public int change(int amount, int[] coins) {
        int[] dp=new int[amount+1];
        dp[0]=1;
        
        for(int i=0;i<coins.length;i++){
            for(int j=coins[i];j<dp.length;j++){
                //traversing to all subproblems in amount update the value of dp with the previous //value  and with dp at current minus coin value
                dp[j]=dp[j]+dp[j-coins[i]];
            }
        }
        return dp[amount];
    }
}