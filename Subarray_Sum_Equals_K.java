public class Subarray_Sum_Equals_K {
    
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int[] prefixSum=new int[nums.length+1];
        prefixSum[1]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefixSum[i+1]=nums[i]+prefixSum[i];
        }
        int end=prefixSum.length-1;
        while(end>0){
        for(int i=0;i<end;i++){
            if(prefixSum[end]-prefixSum[i]==k){
                count++;
            }
        }
        end--;}
       
       return count; 
        
    }
}