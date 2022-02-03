public class Maximum_Subarray {

        public  static int maxSubArray(int[] nums) {
 // this solution is finding maximum contiguous sub array with O(n) time complexity
    int largestNumber=0;
     int sum=0;
            if(nums[0]<0){
    
            largestNumber=nums[0];
                
            }
            for(int i=0;i<nums.length;i++){
                if(nums[i]< 0){
                  sum=sum+nums[i];
                  if(largestNumber<nums[i]){
                        largestNumber=nums[i];}
                    
             else{
                if(largestNumber>sum){
                    continue; }
                largestNumber=sum;
                 }}
             else{
                 if(sum<0){
                     sum=0;
                 }
                sum+=nums[i];
                 
                 if(largestNumber<sum){
                   largestNumber=sum; } } }
           
            
            return largestNumber;
        }
        ////////////// alternative solution with 0(n^2)/////////////
        //         for(int i=0;i<nums.length;i++){
                
    //                 if(largestNumber<nums[i]){
                        
    //                     largestNumber=nums[i];
    //                 }
    //             int sum=0;
    //             for(int j=i;j<nums.length;j++){
                    
    //                   sum  +=nums[j];
    
    //                 if(largestNumber<sum){
                        
    //                     largestNumber=sum;
                        
    //                 }
    //             }
    //         }
    
    public static void main(String[] args) {
        int[] nums={1};
        System.out.println(maxSubArray(nums));
    }
}
    

