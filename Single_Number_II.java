import java.util.HashMap;

public class Single_Number_II {

        public static int singleNumber(int[] nums) {
           
            HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
            int notRepeted=0;
            for(int i=0;i<nums.length;i++){
                if(map.containsKey(nums[i])){
                    
    map.put(nums[i],2);                
                }else{
                map.put(nums[i],1);}
            }
            for(int i=0;i<nums.length;i++){
                if(map.get(nums[i])==1){
                    notRepeted=nums[i];
                }
            }
            return notRepeted;
        }
    
        public static void main(String[] args) {
           //  int[] notRepeted= {2,2,3,2};
          int[] notRepeted= {0,1,0,1,0,1,99};
     System.out.println(singleNumber(notRepeted));
        
        }
        
    }
    
   // Given an integer array nums where every element appears three times except for one, which appears exactly once. Find the single element and return it.

//You must implement a solution with a linear runtime complexity and use only constant extra space

