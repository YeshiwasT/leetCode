class Solution {
    public int[] rearrangeArray(int[] nums) {
        Arrays.sort(nums);
      for(int i=1;i<nums.length;i++){
                  int right=(i+1==nums.length)?nums.length-1:i+1;

          int temp=nums[i];
          if(nums[i-1]<nums[i]&&nums[i]<nums[right]||nums[i-1]>nums[i]&&nums[i]>nums[right]){
              int current=nums[right];
              nums[right]=temp;
              nums[i]=current;
          }
      }
       return nums; 
    }
}