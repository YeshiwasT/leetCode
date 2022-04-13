import java.util.Arrays;

public class NonoverlappingIntervals {
   
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> a[1]-b[1] );
             int count=0;
        int end=-100000;
       
        for(int i=0;i<intervals.length;i++){
            int  start=intervals[i][0];
            if(start>=end){
                //greadly select end time 
                end=intervals[i][1];
            }
            else{
                count++;
            }
            
        }
        
        
        
        
    return count;}
    
}