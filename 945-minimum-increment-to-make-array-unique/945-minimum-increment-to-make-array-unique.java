class Solution {
    public int minIncrementForUnique(int[] nums) {
        
        Arrays.sort(nums);
        int prv=-1;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(prv>=nums[i]){
                int sub=prv-nums[i]+1;
                count+=sub;
                nums[i]=nums[i]+sub;
                prv=nums[i];
            }
            else{
                prv=nums[i];
            }
        }
        return count;
    }
}