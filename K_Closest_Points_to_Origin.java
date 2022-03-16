import java.util.*;
public class K_Closest_Points_to_Origin {
 
    public int[][] kClosest(int[][] points, int k) {
        Double[] arr=new Double[points.length];
        int[][] mArr=new int[k][2];
        int j=0;
        for(int i=0;i<points.length;i++){
       
           double sqrtt= Math.sqrt((points[i][0]*points[i][0])+(points[i][1]*points[i][1]));
        arr[i]=sqrtt;
        }
        Arrays.sort(arr);
                while(j<k)  {
        for(int i=0;i<points.length;i++){
             if(arr[j]==Math.sqrt(points[i][0]*points[i][0]+points[i][1]*points[i][1])){
             
            mArr[j][0]=points[i][0];
            mArr[j][1]=points[i][1];
                 points[i][0]=0;
                                  points[i][1]=0;

      break;
            }

        }
                                 j++;

        }
       
        
     return mArr;   
    }
}