public class Product_of_Array_Except_Self {
    
    public int[] productExceptSelf(int[] nums) {
        int[] prefixMultiplay=new int[nums.length];
        int [] suffixMultiplay=new int[nums.length];
        prefixMultiplay[0]=nums[0];
        suffixMultiplay[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<nums.length;i++){
           
           prefixMultiplay[i]=nums[i]*prefixMultiplay[i-1]; 
        }
        for(int i=nums.length-2;i>=0;i--){
            suffixMultiplay[i]=nums[i]*suffixMultiplay[i+1];
        }
        nums[0]=suffixMultiplay[1];
        nums[nums.length-1]=prefixMultiplay[nums.length-2];
        for(int j=1;j<nums.length-1;j++){
               nums[j]=prefixMultiplay[j-1]*suffixMultiplay[j+1];
        }
        return nums;
    }
}