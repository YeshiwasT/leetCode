class Solution {
    List<String> list=new ArrayList<>(); 
    public int countVowelStrings(int n) {
        int start=0;
        StringBuilder sb=new StringBuilder();
        String str="aeiou";
        countVowel(start,sb,str,n,5);
        return list.size();
    }
    public void countVowel(int start,StringBuilder sb,String str,int n,int len){
        if(n==0){
           list.add(sb.toString());
            return;}
        for(int i=start;i<len;i++){
            sb.append(str.charAt(i));
            countVowel(i,sb,str,n-1,len);
             sb.deleteCharAt(sb.length()-1);
    } }
}