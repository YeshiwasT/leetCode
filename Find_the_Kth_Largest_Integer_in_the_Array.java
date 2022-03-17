import java.util.*;
public class Find_the_Kth_Largest_Integer_in_the_Array {

    public String kthLargestNumber(String[] nums, int k) {
          Arrays.sort(nums, (left, right) ->
        {
            /* If length of left != right, then return
               the diff of the length else  use compareTo
               function to compare values.*/
            if (left.length() != right.length())
                return left.length() - right.length();
             return left.compareTo(right);
        }); 
        System.out.println(Arrays.toString(nums));
         String kLargestNo=nums[nums.length-k];
        return kLargestNo;
         }
    
      }
      
       
        
    