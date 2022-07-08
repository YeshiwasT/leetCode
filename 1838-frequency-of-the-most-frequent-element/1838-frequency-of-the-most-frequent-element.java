class Solution {
    public int maxFrequency(int[] nums, int k) {
        int start=0;
        long total=0;
        int res=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
            if(nums[i]*(i-start+1)<=total+k){
                res=Math.max(res,i-start+1);
            }else{
                while(nums[i]*(i-start+1)>total+k){
                    total-=nums[start];
                    start++;
                    res=Math.max(res,i-start+1);

                }
            }
        }
        return res;
    }
}