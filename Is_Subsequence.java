public class Is_Subsequence {

    public static boolean isSubsequence(String s, String t) {
        int j=0;
        boolean isSub=false;
        for(int i=0;i<t.length();i++){
                    if(j>=s.length()){
                        break;
                    }
            else{
                if(s.charAt(j)==t.charAt(i)){
                    
                       j++;
               
            }
        }}
        if(j==s.length()){
           isSub=true; 
        }
       return isSub; 
    }
    public static void main(String[] args) {
        // is strings of s found in sequence in string t?
        String s="axedvtew";
        String t="aev";
      System.out.println(isSubsequence(s, t));
    }

}