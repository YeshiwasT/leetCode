import java.util.Stack;

public class Reverse_Substrings_Between_Each_Pair_of_Parentheses {

    public String reverseParentheses(String s) {
        Stack<Character> character=new Stack<Character>();
        for(int i=0;i<s.length();i++){
                    StringBuilder  sBuilder=new StringBuilder();

            if(s.charAt(i)!=')'){
                character.push(s.charAt(i));
            }else{
                while(character.peek()!='('){
                    sBuilder.append(character.pop());
                }
                if(character.peek()=='('){
                    character.pop();
                }
                for(int j=0;j<sBuilder.length();j++){
                    character.push(sBuilder.charAt(j));
                }
                
                
            }
        }
        String str="";
        while(!character.isEmpty()){
            str=character.pop()+str;
        }
      return str;  
    }
}