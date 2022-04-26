class Solution {
    public boolean isPalindrome(String s) {
    s = s.replaceAll("[^a-zA-Z0-9]", "");
       StringBuilder sBuild=new StringBuilder(s);
        if(s.equalsIgnoreCase(sBuild.reverse().toString())){
           return true;
        }
    return false;    
    }
}