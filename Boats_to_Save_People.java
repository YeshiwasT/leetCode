import java.util.Arrays;

public class Boats_to_Save_People {

    public int numRescueBoats(int[] people, int limit) {
      
        int count=0;
        Arrays.sort(people);
        int j=people.length-1;
        int i=0;
       while(j>=i){
         count++;
           if(i==j){
               break;
           }
           if(people[i]+people[j]<=limit){
               i++;
           }
           j--;
       
       
       }
        
       return count;
        
    }
}