import java.util.Arrays;

public class Minimize_Maximum_Pair_Sum_in_Array {
  
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int largest=0;
     for(int i=0;i<nums.length/2;i++){
         int max=nums[i]+nums[nums.length-i-1];
         if(largest<max){
             largest=max;
         }
         else{
             continue;
         }
     }
        return largest;
    }
}