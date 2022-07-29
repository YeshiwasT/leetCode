class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res=new int[2];
        int start=0;
        int end=numbers.length-1;
       while(start<end){
           int ans=numbers[start]+numbers[end];
           if(ans>target){
               end--;
           }
           if(ans<target){
               start++;
           }
           if(ans==target){
               res[0]=start+1;
               res[1]=end+1;
               break;
           }
       }
        return res;
    }
}