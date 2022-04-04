public class Container_With_Most_Water {
    
    public int maxArea(int[] height) {
        int maxArea=0;
        
       int width=height.length-1;
            int point1=0;
        int point2=height.length-1;
            while(width!=0){
                if(height[point2]<height[point1]){
                    
          int   tempArea=height[point2]*width;
                  if(maxArea<tempArea){
                    maxArea=tempArea;
                }
                    point2--;
                }else{
                    int   tempArea=height[point1]*width;
                  if(maxArea<tempArea){
                    maxArea=tempArea;
                }
                    point1++;
                }
             
                width--;
            }
        
      return maxArea;  
    }
}