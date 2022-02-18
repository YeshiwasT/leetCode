import java.util.HashMap;

public class Single_Number_III {
    public int[] singleNumber(int[] nums) {

           
        HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
       
    int[] array =new int[2];
    int j=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                
map.put(nums[i],2);                
            }else{
            map.put(nums[i],1);}
        }
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==1){
                array[j]=nums[i];
                j++;
            }
        }
        return array;
    }
    
}
