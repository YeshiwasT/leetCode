import java.util.Scanner;

public class CodeForOne {
         static String s="";
   public static String findOne(long n) {
                if (n==1||n==0) {
                    return  Long.toString(n);
                }
                
                String findOne=findOne(n/2);
                
            return findOne+n%2+findOne;
         }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String[] input=sc.nextLine().split(" ");


       String str=findOne(Integer.valueOf(input[0]));
    //    String str=findOne(10l);
    
        int count=0;
        int begin=Integer.valueOf(input[1]);
        int end=Integer.valueOf(input[2]);
        for(int i=begin-1;i<end;i++){
            if(str.charAt(i)=='1'){
                count++;
            }
        }
       System.out.println(count);

    }
}
//903316762502 354723010040 354723105411