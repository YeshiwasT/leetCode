
import java.util.HashMap;
import java.util.Stack;

public class Next_Greater_Element_I {
   
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {
           int[] arry=new int[nums2.length];
            HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
            Stack<Integer> s=new Stack<Integer>();
            for(int i=nums2.length-1;i>=0;i--){
                while(!s.empty()&&s.peek()<nums2[i]){
                    s.pop();
                }
                arry[i]=s.empty()?-1:s.peek();
                s.push(nums2[i]);
                
            }
            for(int j=0;j<nums2.length;j++){
                map.put(nums2[j],j);
            }
            for(int k=0;k<nums1.length;k++){
              nums1[k]=arry[map.get(nums1[k])];
            }
          
            
            
            
            return nums1;
            
        }
    

}