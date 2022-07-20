class Solution {
    public boolean isPowerOfFour(int n) {
       boolean isPower=false;
        if(n==1)return true;
        Double d2=Double.valueOf(n);
      return  helper(d2);}
 
     public boolean helper(double n){
        if(n%4==0&&n/4==1){
            System.out.println(n);
            return true;
        }
        if(n<1){
            return false;
        }

    return helper(n/4);
    } 
}