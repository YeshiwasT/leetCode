import java.util.Collections;
import java.util.PriorityQueue;

public class Maximum_Product_of_Two_Elements_in_an_Array {
  
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        int first=pq.poll()-1;
     
        int second=pq.poll()-1;
         

        return first*second;
    }
}