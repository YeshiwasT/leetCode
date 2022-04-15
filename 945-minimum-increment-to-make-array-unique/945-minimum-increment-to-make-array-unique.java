class Solution {
    public int minIncrementForUnique(int[] nums) {
        int count=0;
        int prvNumber=-1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(prvNumber>-1){
                if(prvNumber>=nums[i]){
                    int diff=(prvNumber-nums[i])+1;
                    count+=diff;
                    nums[i]=nums[i]+diff;
                }
            }
            prvNumber=nums[i];
        }
        
             
        return count;
    }
}