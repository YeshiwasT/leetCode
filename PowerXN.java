class PowerXN {
    public static double myPow(double x, int n) {
        int startPoint=0;
        double pow=x/x;
        System.out.println(pow);
        if(n>0){
            while(startPoint<n){
                pow=pow*x;
                startPoint++;
            }
        }else{
            if(n==0){
                x=1.0;
            }else{
               while(startPoint>n){
                pow=pow/x;
                startPoint--;
            } 
            }
        }
        
            return pow;
    }
    public static void main(String[] args) {
        System.out.println(myPow(2.00000, -2));
    }
}