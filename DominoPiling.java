import java.util.Scanner;

public class DominoPiling{
    public static int domino(int M,int N){
        
        return M*N/2;
    }
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        String str=scanner.nextLine();
        String[] input=str.split(" ");
        
        System.out.println( domino(Integer.valueOf(input[0]),Integer.valueOf(input[1])));
    }
    
}