import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arithmetic_Subarrays {
 
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> isSequence=new ArrayList<Boolean>();
       boolean isArithmetic=false;
        int[] copy=new int[nums.length];
        
        
        for(int j=0;j<l.length;j++){
            int left=l[j];
            int right=r[j];
            for(int k=0;k<copy.length;k++){
            copy[k]=nums[k];
        } 
            Arrays.sort(copy,left,right+1);
            
        for(int i=left;i<right;i++){
            if(copy[left+1]-copy[left]==copy[i+1]-copy[i]){
               isArithmetic=true; 
            }else{
                isArithmetic=false;
                break;
            }
           
        }
        isSequence.add(isArithmetic);
        }
        return isSequence;
    }
}