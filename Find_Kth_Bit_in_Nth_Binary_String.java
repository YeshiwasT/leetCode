public class Find_Kth_Bit_in_Nth_Binary_String {

    static int length=0;

public static char findKthBit(int n, int k) {
 String str="0";
    String s=name(str,n, k);
    System.out.println(s);
    return s.charAt(k-1);
}
public static String name(String str,int n, int k) {
    if(k==1&&n==1){
        return str;
    }
    
      else
    {
    String inverted="";
    for(int i=0;i<str.length();i++){
      String  invert=str.charAt(i)=='0'?"1":"0";
        inverted=inverted+invert;
    }
    String reverse="";
    for(int j=0;j<inverted.length();j++){
        char ch=inverted.charAt(j);
        reverse=ch+reverse;
    }
    str=   str+"1"+reverse;
    System.out.println("h"+str);
   // length=str.length();
    return name(str,n-1,k/2);} 
    
    
}
public static void main(String[] args) {
    System.out.println(findKthBit(4, 11));
}
}