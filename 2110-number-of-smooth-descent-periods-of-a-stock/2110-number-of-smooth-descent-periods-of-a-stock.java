class Solution {
    public long getDescentPeriods(int[] prices) {
        int j=0;
        long ans=1;
        for(int i=1;i<prices.length;i++){
            if(prices[i-1]-prices[i]==1){
                int res=i-j+1;
                ans+=(long)res;
            }
            else{
                j=i;
                ans+=1;
            }
        }
        return ans;
    }
}