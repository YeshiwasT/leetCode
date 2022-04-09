import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Relative_Ranks {
 
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        String[] sArr=new String[score.length];
        for(int i=0;i<score.length;i++){
            map.put(score[i],i);
        }
        for(int i=0;i<score.length;i++){
            pq.add(score[i]);
        }
        if(score.length>=3){
        sArr[map.get(pq.poll())]="Gold Medal";
     sArr[map.get(pq.poll())]="Silver Medal";
                sArr[map.get(pq.poll())]="Bronze Medal";

              int k=4;
        while(!pq.isEmpty()){
              sArr[map.get(pq.poll())]=Integer.toString(k) ;
            k++;
        }}else{
            if(score.length==1){
                sArr[0]="Gold Medal";
            }else{
                              sArr[map.get(pq.poll())]="Gold Medal";
                                sArr[map.get(pq.poll())]="Silver Medal";

  
            }
        }
        
        return sArr;
    }
}