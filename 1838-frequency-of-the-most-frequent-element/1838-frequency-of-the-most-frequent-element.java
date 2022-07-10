class Solution {
    public int maxFrequency(int[] nums, int k) {
        int total=0;
        int start=0;
        int ans=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
          if(nums[i]*(i-start+1)-total<=k){
             ans=Math.max(ans,i-start+1); 
          }else{
            total-=nums[start];
              start++;
          }  
        }
        return ans;
    }
}