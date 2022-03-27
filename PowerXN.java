class PowerXN {
    public static double myPow(double x, int n) {
       
                if(n==0){
                    return 1;
                }
           
               if(n==-1){
                   return 1/x;
               }
                  if(n==1||x==1||x==0){
                       return x; 
                   }
                if(x==-1){
                    if(n%2==0){
                        return 1;
                    }else{
                        return -1;
                    }
                }
                  if(n<-214748364&&x!=-1.0||n<-214748364&&x!=1){
        return 0;}
                if(n%2==0){
                    if(n>0){
                    return myPow(x*x,n/2);}
                    else{
                        x=1/x;
                        n=-n;
                        return myPow(x*x,n/2);
                    }
                }
                else{
                if(n>0){
                   
                    return x*myPow(x*x,n/2);
                }else{
                    x=1/x;
                    n=-n;
                   
                    return x*myPow(x*x,n/2);
                }}
                
            }
        
    
    public static void main(String[] args) {
        System.out.println(myPow(2.00000, -2));
    }
}