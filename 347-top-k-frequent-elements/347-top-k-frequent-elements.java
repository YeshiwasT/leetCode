import java.util.HashMap;
import java.util.Map.Entry;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         
        HashMap <Integer,Integer> map= new HashMap<Integer,Integer>();
            
           for (int i = 0; i < nums.length; i++) {
             map.put(nums[i],map.getOrDefault(nums[i],0)+1);
                  }
           
int[] values = new int[map.size()];
        int[] frequent = new int[k];
int index = 0;
for (Map.Entry<Integer, Integer> mapEntry : map.entrySet()) {
    
    values[index] = mapEntry.getValue();
    index++;
}
                Arrays.sort(values);
        int z=0;
        while(z<k){
           for(Entry<Integer, Integer> entry: map.entrySet()) {

      if(entry.getValue() == values[values.length-1-z]) {
          frequent[z]=entry.getKey();
          map.remove(entry.getKey());
        break;
      }}
       z++;}
       

      return frequent;  
    }
    }
