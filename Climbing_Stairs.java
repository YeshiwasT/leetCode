public class Climbing_Stairs {

    public static int climbStairs(int n) {
        
        int[] array = new int[n+1];
        array[0]=1;
         array[1]=2;
        int result=0;

        if (n==1){
            result=array[0];
            return result ;
        }
        if (n==2){
            result=array[1];
            return result ;
        }
        
        for(int i=2;i<n;i++){
       
              array[i]=array[i-1]+array[i-2];
        
            result=array[i];
        }
      
        
       return result; 
        
    
    }
    public static void main(String[] args) {
        // to count how many ways to climb stairs if and only if  we go 1 stair at a time or 2 stairs at a time 
      // n is number of staris
              ///************** dynamic programing problem solving */

              System.out.println(climbStairs(10));// 10 is number of thhe stairs

    }
    
}
