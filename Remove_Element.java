public class Remove_Element {
    public static int removeElement(int[] nums, int val) {
        int z=0;
        int value=nums.length;    
        for(int j=0;j<nums.length;j++){   
            if(nums[j]==val){
            
                value=value-1;
            }
            else if(z<j&& nums[j]!=val){
              nums[z]=nums[j];
                z++;                
        
            
            }
            else{
                z++;
            }
        }
        return value;
        
    }
    public static void main(String[] args) {
        int[] nums = {3,2,2,3}; // Input array
       int val = 3; // Value to remove from the array

       removeElement(nums, val);//it returns how much length of array  we left after removing
       //the value val from array nums
    }
    
}
