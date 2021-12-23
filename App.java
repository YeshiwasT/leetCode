import java.util.HashMap;

public class App {
    public static int[] twoSum(int[] nums, int target) {
    
        HashMap<Integer,Integer> valIndex=new HashMap<Integer,Integer>();
                  int[] twoIndex= new int[2];
  
          for(int i=0;i<nums.length;i++){
              int sub=target-nums[i];
              if(valIndex.containsKey(nums[i])){
                 twoIndex[0]= i;
                  twoIndex[1]= valIndex.get(nums[i]);
  
  
              }else{
              valIndex.put(sub,i);
    
              }
          }
          //Prints index of array which the sum gives the target number
          for(int i=0;i<twoIndex.length;i++){
       System.out.println(twoIndex[i]);      } 

                      return twoIndex;
      }
    public static void main(String[] args) throws Exception {
       int[] nums= {15,7,11,2};
       int target=9;
       // to add two numbers from the array that give target number and return their index
       twoSum(nums,target);
    }
}
