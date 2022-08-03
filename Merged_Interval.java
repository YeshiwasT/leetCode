import java.util.*;

public class Merged_Interval {
    static int k=0;
  
    public static int[][] merge(int[][] intervals) {

     
        
     // Loop through all rows
     Arrays.sort(intervals, new Comparator<int[]>() {
            
        @Override              
        // Compare values according to columns
        public int compare(final int[] entry1, 
                           final int[] entry2) {

          // To sort in descending order revert 
          // the '>' Operator
          if (entry1[0] > entry2[0])
              return 1;
          else
              return -1;
        }
      });
         ArrayList<ArrayList<Integer> > x
            = new ArrayList<ArrayList<Integer> >();
               for (int i = 0; i < intervals.length; i++)
               {
                           int last=(i+1)==intervals.length?intervals.length-1:i+1;

                if( intervals[i][1]>=intervals[last][0]){
                    if(intervals[i][1]>=intervals[last][1]){
                     x.add(
            new ArrayList<Integer>(Arrays.asList(intervals[i][0], intervals[i][1])));
                                    i++;
}else{
                     x.add(
            new ArrayList<Integer>(Arrays.asList(intervals[i][0], intervals[last][1])));
                                        i++;

                }
                   
                    
                }else{
                     x.add(
            new ArrayList<Integer>(Arrays.asList(intervals[i][0], intervals[i][1])));
                   
                }
               
               }  
               int[][] merged=new int[x.size()][2];

           // }}
             //   System.out.print(intervals[i][j] + " ");
       merged=x.stream()
                .map(l -> l.stream().mapToInt(Integer::intValue).toArray())
                .toArray(int[][]::new);
        int lastd=(k+1)==x.size()?x.size()-1:k+1;

while(merged[k][1]>merged[lastd][0]&&k<x.size()){
    x.clear();


k++;}
for (int i = 0; i < intervals.length; i++) {
    System.out.println(Arrays.toString(intervals[i]));
        
    }
  
        return merged;

    
}
public static void main(String[] args) {
    int[][] arr={{2,6},{5,10},{1,3},{8,14},{23,54}};
   merge(arr);
   
    
}
}