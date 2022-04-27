class Solution {
    public boolean validPalindrome(String s) {
      StringBuilder sBuild=new StringBuilder(s);
    
      String sBuildI="as";
     String sBuildN="fg";
     String sBuildIR="gr";
     String sBuildNR="ty";

     int   n=s.length()-1;
        for(int i=0;i<sBuild.length();i++){
            if(n>0&&sBuild.charAt(i)!=sBuild.charAt(n)){
                if(sBuild.charAt(i+1)==sBuild.charAt(n)){
                    StringBuilder forI=new StringBuilder(s);
                                   forI.deleteCharAt(i);
                   sBuildI=forI.toString();
                    sBuildIR=forI.reverse().toString();

                }
                if(sBuild.charAt(i)==sBuild.charAt(n-1)){
                      StringBuilder forN=new StringBuilder(s);
                   forN.deleteCharAt(n);
                
                   sBuildN=forN.toString();
                 sBuildNR=forN.reverse().toString();


                }
               
                  break;
            }
            n--;
        }
        if(sBuildI.equals(sBuildIR)||sBuildN.equals(sBuildNR)||s.equals(sBuild.reverse().toString())){
            return true;
        }
    
    return false;}
}