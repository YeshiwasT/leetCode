class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,Comparator.comparingDouble(o -> o[0]));
        int i=intervals.length;
         ArrayList<int[][]> list=new ArrayList<>();
        int[][] start=new int[1][2];
        start[0][0]=intervals[0][0];
        start[0][1]=intervals[0][1];

        list.add(start);
        // System.out.println(;
        // ArrayList[][] table = new ArrayList[1][2];
       
           for(int j=1;j<intervals.length;j++){
               if(intervals[j][0]<=list.get(list.size()-1)[0][1]){
                              //    break;
                    int[][] replace=new int[1][2];
                    replace[0][0]=list.get(list.size()-1)[0][0];
                          if(intervals[j][1]<list.get(list.size()-1)[0][1]){

        replace[0][1]=list.get(list.size()-1)[0][1];
                          }else{
                             
             replace[0][1]=intervals[j][1];  
                          }
                                      list.set(list.size()-1,replace); 

              
               }else{
                  int[][] added=new int[1][2];
        added[0][0]=intervals[j][0];
        added[0][1]=intervals[j][1];
                   list.add(added);  
               }
                
              
           } 
        int[][] ans=new int[list.size()][2];
            for(int k=0;k<list.size();k++){
                ans[k][0]=list.get(k)[0][0];
               ans[k][1]=list.get(k)[0][1];

            }
        
        
        return ans;
        
    }
}