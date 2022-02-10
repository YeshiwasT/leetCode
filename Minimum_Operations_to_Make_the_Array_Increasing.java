public class Minimum_Operations_to_Make_the_Array_Increasing {
    
    public int minOperations(int[] nums) {
        int count=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                continue;
            }
            else{
                count=count+nums[i-1]-nums[i]+1;
                nums[i]=nums[i-1]+1;
            }
        }
       return count; 
    }

    
}
