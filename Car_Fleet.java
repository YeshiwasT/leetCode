import java.util.Arrays;
import java.util.Comparator;

public class Car_Fleet {
    

    public int carFleet(int target, int[] position, int[] speed) {
       int[][] array=new int[position.length][2];
        Double targe=Double.valueOf(target);
        double time=0.0;
        int fleet=0;
        for(int i=0;i<position.length;i++){
            array[i][0]=position[i];
            array[i][1]=speed[i];
              

        }
          Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] first, int[] second) {
               if(first[0] < second[0]) return 1;
               else return -1;
            }
        });
         for(int i = 0; i< position.length; i++) {
           
                     Double positio=Double.valueOf(array[i][0]);
        Double spee=Double.valueOf(array[i][1]);

            double timeEach=(targe-positio)/spee; 
             
             if(time<timeEach){
                fleet++;
                 time=timeEach;
             }
         
         }
        
    
    return fleet;
    }
}