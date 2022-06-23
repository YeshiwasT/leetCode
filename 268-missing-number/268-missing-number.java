class Solution {
    public int missingNumber(int[] nums) {
        int missed=0;
        for(int i=0;i<nums.length;i++){
            missed=missed^nums[i]^i;
        }
        missed=missed^nums.length;
        return missed;
        
    }
}