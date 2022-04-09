import java.util.Arrays;

public class Last_Stone_Weight {
  
    public int lastStoneWeight(int[] stones) {
        
        
        Arrays.sort(stones);
        if(stones.length==1){
            return stones[0];
        }
            if(stones[stones.length-2]==0){
                return stones[stones.length-1];
            }
        
            if(stones[stones.length-1]!=0){
                if(stones[stones.length-1]-stones[stones.length-2]>0){
                 
                    stones[stones.length-1]=stones[stones.length-1]-stones[stones.length-2];
                    stones[stones.length-2]=0;
                }else{
                    stones[stones.length-1]=0;
                    stones[stones.length-2]=0;
                }
        }
        
         return         lastStoneWeight(stones);
        
    }
  
}