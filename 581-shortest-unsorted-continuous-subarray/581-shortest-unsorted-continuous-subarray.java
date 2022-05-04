class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] copy=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            copy[i]=nums[i];
        }
        Arrays.sort(copy);
        int first=0;
        for(int i=0;i<nums.length;i++){
            if(copy[i]!=nums[i]){
              first=i;
                break;
            }
        }
        int second=-1;
         for(int i=0;i<nums.length;i++){
            if(copy[i]!=nums[i]){
              second=i;
                
            }
        }
        return second-first+1;
    }
}