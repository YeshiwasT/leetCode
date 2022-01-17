public class Remove_Duplicates_from_Sorted_Array {
    
        public int removeDuplicates(int[] nums) {
            int j=0;
            if(nums.length==0){
                return 0;
            }else{
            for(int i=0;i<nums.length-1;i++){
                if(nums[i]!=nums[i+1]){
                    
                    nums[j]=nums[i];
                    j++;
                    
                }
                else{
                    continue;
                }
            }
            nums[j]=nums[nums.length-1];
            j++;
            return j;
            
        }}
    
    
}
