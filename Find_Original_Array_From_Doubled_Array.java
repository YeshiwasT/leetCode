import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Find_Original_Array_From_Doubled_Array {
    public int[] findOriginalArray(int[] changed) {

        List<Integer> list=new ArrayList<>();
         HashMap<Integer,Integer> map =new HashMap<>();
                     int[] ans=new int[changed.length/2];
                            int[] array={};
        Arrays.sort(changed);
        int k=0;
        for(int i=0;i<changed.length;i++){
                   if(map.containsKey(changed[i])){
                       if(map.get(changed[i])>1){
                           map.replace(changed[i],map.get(changed[i])-1);
                       }else{
                       map.remove(changed[i]);}
                   }else{
                   
                        if(map.containsKey(changed[i]*2)){
                           map.replace(changed[i]*2,map.get(changed[i]*2)+1);
                            }else{
                   map.put(changed[i]*2,1);}
                    list.add(k,changed[i]);
                   k++;
            
            }
        }
        if(changed.length-list.size()==list.size()&&map.isEmpty()){
            for(int i=0;i<list.size();i++){
                ans[i]=list.get(i);
            }
        }else{
            return array;
        }

        return ans;}
    }
    
