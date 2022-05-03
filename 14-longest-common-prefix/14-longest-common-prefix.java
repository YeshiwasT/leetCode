class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s=strs[0];
        String k="";
        for(int i=1;i<strs.length;i++){
           for(int j=0;j<strs[i].length()&&j<s.length();j++){
                    if(s.charAt(j)==strs[i].charAt(j)){
                        k+=s.charAt(j);
                    }else{
                        if(s.charAt(0)!=strs[i].charAt(0)){
                                    return ""; }
                        break;}}
                    s=k;
                    k=""; }
      
       return s;
    }
}