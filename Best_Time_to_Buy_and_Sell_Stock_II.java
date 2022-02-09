public class Best_Time_to_Buy_and_Sell_Stock_II {
    public static int maxProfit(int[] prices) {
        
        int[] dp= new int[prices.length];
        dp[0]=0;
        int profit=0;
        for(int i=1;i<prices.length;i++){
            dp[i]=Math.max(dp[i-1],dp[i-1]+prices[i]-prices[i-1]);
        }
        profit=dp[dp.length-1];
       return profit; 
    }
    public static void main(String[] args) {
        //given an array of days with the value of price 
        int [] array={7,6,4,3,1};
        //when is best time to sell maximum profit and return profit
        maxProfit(array);
    }
    
}
