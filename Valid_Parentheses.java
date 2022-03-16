import java.util.Stack;

public class Valid_Parentheses {
    
    public static boolean isValid(String s) {
        boolean isCorrectParenthesis=false;
        Stack<Character> parenthesis=new Stack<>();
         for (int i = 0; i < s.length(); i++) {
             if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                parenthesis.push(s.charAt(i));
                 isCorrectParenthesis=false;
             }
             else if(s.charAt(i)==')'||s.charAt(i)==']'||s.charAt(i)=='}'){
                 if (parenthesis.empty()) {
                     parenthesis.push(s.charAt(i));
                     isCorrectParenthesis=false;
                     break;
                 }else if (s.charAt(i)==')'&&parenthesis.peek()=='(') {
                        parenthesis.pop();
                      if (parenthesis.empty()) {
            isCorrectParenthesis=true; 
         }
                }
                else if (s.charAt(i)==']'&&parenthesis.peek()=='[') {
                    parenthesis.pop();
                     if (parenthesis.empty()) {
            isCorrectParenthesis=true; 
         }
            }
            else if (s.charAt(i)=='}'&&parenthesis.peek()=='{') {
                parenthesis.pop();
                 if (parenthesis.empty()) {
            isCorrectParenthesis=true; 
         }
        }
                 else{
                     isCorrectParenthesis=false;
                     parenthesis.push(s.charAt(i));
                 }
            }
             
         }
        
 
        return isCorrectParenthesis;
    }
    public static void main(String[] args) {
        String s="([{}]([))]";
        System.out.println(isValid(s));
    }
}
