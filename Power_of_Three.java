public class Power_of_Three {
   private static boolean isPowerOfThree(int n) {
   
            //Iterative method
          //  boolean isPower=false;
           //  if (n!=0) {
           //      if (n==1) {
           //          isPower=true;
           //      }
           //     while (n%3==0) {
           //         if(n==3){
           //         isPower=true;
           //             break;
           //         }
           //         n=n/3;
           //     }}
           // return isPower;
            
      // } 
            // recursive method
     
            if(n==0){
                return false;
            }
            if(n==1){
                return true;
            }
            
            if(n%3==0){
               
                return isPowerOfThree(n/3);
            }else{
           return false;}     
               
        
        
            
        
        
            
        }
    
   public static void main(String[] args) {
       //error in 15 or 45
       System.out.println(isPowerOfThree(3));
   }
}
