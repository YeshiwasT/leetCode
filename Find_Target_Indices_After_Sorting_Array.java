import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_Target_Indices_After_Sorting_Array {
    
    public static List<Integer> targetIndices(int[] nums,int target) {

List<Integer> list =new ArrayList<Integer>();
Arrays.sort(nums);
for (int i = 0; i < nums.length; i++) {
    if (nums[i]==target) {
        list.add(i);
    }
}
for (int i = 0; i <list.size() ; i++) {
    System.out.println( list.get(i));
      
  }

        return list;
    }
    public static void main(String[] args) {
        int[] nums={1,2,5,2,3};
        targetIndices(nums,4);
     
    }
    
}
