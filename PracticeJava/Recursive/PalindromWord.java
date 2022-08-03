package PracticeJava.Recursive;

public class PalindromWord {
    static String by="";
    public static String palindrom(String s,int x){
            if (x==s.length()) {
                return null;
            }

             palindrom(s,x+1);
               by+=s.charAt(x);   
        return by;
        
    }
    public static void main(String[] args) {
        String str="otok";
        System.out.println(palindrom(str,0).equals(str));
    }
}
