public class Find_Nearest_Point_That_Has_the_Sam_X_or_Y_Coordinate {

    public int nearestValidPoint(int x, int y, int[][] points) {
        int mDistance=Integer.MAX_VALUE;
        int index=-1;
        for(int i=0;i<points.length;i++){
            if(points[i][0]!=x&&points[i][1]!=y&&index==-1){
                index=-1;
            }else
            if(points[i][0]==x||points[i][1]==y){
                int manD=Math.abs(x-points[i][0])+Math.abs(y-points[i][1]);
               
               if(mDistance>manD){
                   mDistance=manD;
                   index=i;
               
                }
                
            
            }
        }
        return index;
    }
}