public class Power_of_Four {
 
    private static boolean isPowerOfThree(int n) {
        boolean isPower=false;
        if (n!=0) {
            if (n==1) {
                isPower=true;
            }
            while (n%4==0) {
                if(n==4){
                isPower=true;
                break;
                }
                n=n/4;
             
        }
            }
        return isPower;
    } 
    public static void main(String[] args) {
        //error in 15 or 45
        System.out.println(isPowerOfThree(40));
    }
 }
 