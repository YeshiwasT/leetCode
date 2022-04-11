import java.util.Stack;

public class Decode_String {

    public String decodeString(String s) {
        Stack<Character> stack=new Stack<>();
        String str="";
        String intStr="";
        String repeatedStr="";
        for(int i=0;i<s.length();i++){
                 if(s.charAt(i)!=']'){
                     stack.add(s.charAt(i));
                 }
                  else{  
        while(stack.peek()!='['){
             str=stack.pop()+str;  }
                      stack.pop();
         while(!stack.isEmpty()){
                 try{
                  int   intValue=Integer.parseInt(Character.toString(stack.peek()));
                     intStr=Integer.toString(intValue)+intStr;
                     stack.pop();

                }catch(NumberFormatException e){
                     break;
            }   }
                      int idz=Integer.parseInt(intStr);
                      while(idz>0){
                         repeatedStr+=str; 
                          idz--;
                      }
                      intStr="";
                       for(int g=0;g<repeatedStr.length();g++){
                        stack.push(repeatedStr.charAt(g));
                    } 
                      repeatedStr="";
                      str="";
                       
           }
        }
        String ans="";
        while(!stack.isEmpty()){
          ans=stack.pop()+ans;  
        }
        
return ans;
    }
}