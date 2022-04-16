class Solution {
           int[] dp=new int[31];
     //recursive dp        
    public int fib(int n) {
         dp[0]=1;
         dp[1]=1;
       if(n<=0)return n ;
       if(dp[n]!=0){
           return dp[n];
       }
     return  dp[n]= fib(n-1)+fib(n-2);
    }
         //iteration dp
//       public int fib(int n) {
//         int[] dp=new int[n+2];
//       dp[0]=0;
//       dp[1]=1;
//       for (int i = 2; i < dp.length; i++) {
//           dp[i]=dp[i-1]+dp[i-2];
//       } 
//         return dp[n];
        
//     }
}