import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Reduce_Array_Size_to_The_Half {
   
    public int minSetSize(int[] arr) {
        HashMap <Integer,Integer> map= new HashMap<Integer,Integer>();
            
           for (int i = 0; i < arr.length; i++) {
             
     if(map.containsKey(arr[i])){
              map.put(arr[i],map.get(arr[i])+1);
     }
  
         else{
                           map.put(arr[i],1);

         }
         
                  }
        
int[] values = new int[map.size()];
int index = 0;
for (Map.Entry<Integer, Integer> mapEntry : map.entrySet()) {
    
    values[index] = mapEntry.getValue();
    index++;
}
                Arrays.sort(values);
        int current=0;
        int atHalf=0;
        for(int i=0;i<values.length;i++){
            int temp=values[values.length-1-i];
            current+=temp;
                        atHalf++;

            if(current>=arr.length/2){
                break;
            }
            
        }
       

      return atHalf;  
    }
}