class Solution {
    public long mostPoints(int[][] questions) {
//          int len = questions.length;
//         long dp[] = new long[len];
//         dp[len-1] = questions[len-1][0];
        
//         for(int i=len-2; i>=0; i--) {
//             int nextQuestion = i + questions[i][1] + 1;
//             long includePoints = questions[i][0] + (nextQuestion < len ? dp[nextQuestion] : 0);
            
//             dp[i] = Math.max(dp[i+1], includePoints);
//         }
//         System.out.println(Arrays.toString(dp));
//         return dp[0];
        long ans=0;
        HashMap<Integer,Long> map=new HashMap<>();
        for(int i=questions.length-1;i>=0;i--){
            if((i+questions[i][1]+1)>=questions.length){
                ans=Math.max(ans,(long)questions[i][0]);
                map.put(i,ans);
            }
            else {
                ans=Math.max(ans,(long)questions[i][0]+map.get(i+questions[i][1]+1));
                                System.out.println(ans);

                map.put(i,ans);
            }
        }
     return ans;   
    }
}