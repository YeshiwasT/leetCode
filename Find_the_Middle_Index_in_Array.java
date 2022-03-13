public class Find_the_Middle_Index_in_Array {
 
    public int findMiddleIndex(int[] nums) {
        int less=0;
        int greater=0;
        int middle=0;
        for(int i=0;i<nums.length;i++){
          
            int j=0;
          while(j<i){
           less=less+nums[j];
              j++;
          }
            j=i+1;
            while(j<nums.length){
                greater=greater+nums[j];
                j++;
              
            }
                if(less==greater){
             middle=i;
                break;
            }else{
                   
                                         middle=-1;
   
                    
                }
          greater=0;
            less=0;
            
        }
       return middle; 
    }
}