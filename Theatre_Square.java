import java.util.Scanner;

public class Theatre_Square {
    public static long min_theatre_squqre(long[] arr) {
        long up=0;
        long left=0;
        for (long i = 0; i < arr[0]; i=i+arr[2]) {
           up++;
        }
           
            for (long j = 0; j < arr[1]; j=j+arr[2]) {

                left++;

            }
            
        
      return up*left ;  
    }
    public static void main(String[] args) {
        long[] arr=new long[3];

        Scanner sc=new Scanner(System.in);
        long n      = sc.nextLong();
        long m     = sc.nextLong();
        long a     = sc.nextLong();
        if (a==1) {
            System.out.println(n*m);
            return;
        }
        arr[0]=n;
        arr[1]=m;
        arr[2]=a;

       System.out.println( min_theatre_squqre(arr));
    }
}
