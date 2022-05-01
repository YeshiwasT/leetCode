class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack s1=new Stack();
        Stack s2=new Stack();
          for(int i=0;i<s.length();i++){
              if(!s1.isEmpty()&&s.charAt(i)=='#'){
                  s1.pop();
              }else{
                  if(s.charAt(i)!='#'){
                  s1.push(s.charAt(i));  }
              }
          }
          for(int i=0;i<t.length();i++){
              if(!s2.isEmpty()&&t.charAt(i)=='#'){
                  s2.pop();
              }else{
                  if(t.charAt(i)!='#'){
                       s2.push(t.charAt(i)); }
              }
          }
        String s1Str="";
        String s2Str="";

        while(!s1.isEmpty()){
            s1Str+=s1.pop();
        }
         while(!s2.isEmpty()){
            s2Str+=s2.pop();
        }
        if(s1Str.equals(s2Str)){
                        return true;
        }
        return false;
    }
}