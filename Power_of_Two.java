public class Power_of_Two {
   
    public boolean isPowerOfTwo(int n) {
        
    boolean isPower=false;
        if (n!=0) {
            if (n==1) {
                isPower=true;
            }
            while (n%2==0) {
                if(n==2){
                isPower=true;
                break;
                }
                n=n/2;
             
        }
            }
        return isPower;
    }} 