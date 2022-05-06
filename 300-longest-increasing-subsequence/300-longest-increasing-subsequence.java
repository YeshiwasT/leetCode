class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] arr=new int[nums.length];
       
        for(int i=0;i<nums.length;i++){
          arr[i]=1;
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]&&arr[i]<arr[j]+1){
                    arr[i]=arr[j]+1;
                }
            }
        }
        int max=arr[0];
        for(int ar:arr){
            if(max<ar){
                max=ar;
            }
        }
        return max;
    }
}