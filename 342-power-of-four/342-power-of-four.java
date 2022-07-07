class Solution {
    public boolean isPowerOfFour(int n) {
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
}