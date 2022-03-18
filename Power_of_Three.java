public class Power_of_Three {
   private static boolean isPowerOfThree(int n) {
       boolean isPower=false;
       if (n!=0) {
        if (n==1) {
            isPower=true;
        }
           while (n%3==0) {
               if(n==3){
               isPower=true;
               break;
               }
               n=n/3;
           }}
       return isPower;
   } 
   public static void main(String[] args) {
       //error in 15 or 45
       System.out.println(isPowerOfThree(3));
   }
}
