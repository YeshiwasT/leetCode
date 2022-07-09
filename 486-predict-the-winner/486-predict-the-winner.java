class Solution {
    public boolean PredictTheWinner(int[] nums) {
       
        return predict(nums,0,nums.length-1)>=0;
    }
    public int predict(int[] nums,int begin,int end){
        return begin==end?nums[end]:Math.max(nums[end]-predict(nums,begin,end-1),nums[begin]-predict(nums,begin+1,end));
        
    }

}