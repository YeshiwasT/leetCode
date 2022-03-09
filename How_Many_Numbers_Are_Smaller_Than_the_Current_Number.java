import java.util.Arrays;
import java.util.Hashtable;

public class How_Many_Numbers_Are_Smaller_Than_the_Current_Number {
   
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] array=new int[nums.length];
        Hashtable<Integer,Integer> hash =new Hashtable<>();
        for(int i=0;i<nums.length;i++){
            array[i]=nums[i];
            
        }
        Arrays.sort(array);
        for (int j = 0; j < array.length; j++) {
            if (hash.containsKey(array[j])) {
                hash.put(array[j],hash.get(array[j]));
                
            }else{
                hash.put(array[j],j);
               
            }
        }
        for (int k = 0; k < array.length; k++) {

            if(hash.containsKey(nums[k])){
                nums[k]=hash.get(nums[k]);
            }
            
        }
      

        
        return nums;
        
    }
    public static void main(String[] args) {
        int[] arr={2,7};
        for (int i = 0; i < arr.length; i++) {
        System.out.println(smallerNumbersThanCurrent(arr)[i]);
            
        }
    }

}