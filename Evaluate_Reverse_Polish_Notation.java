import java.util.Stack;

public class Evaluate_Reverse_Polish_Notation {
 
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<Integer>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                                                             

                int sum=stack.pop()+stack.pop();
                stack.push(sum);
            }
            else if(tokens[i].equals("-")){
                                                                               

                int diffSecond=stack.pop();
                    int diffFirst=stack.pop();
                stack.push(diffFirst-diffSecond);
            }
           else  if(tokens[i].equals("*")){
                                                              

                int multiply=stack.pop()*stack.pop();
                stack.push(multiply);
            }
            else if(tokens[i].equals("/")){
                                                                               ;

                int divideSecond=stack.pop();
                int divideFirst=stack.pop();
                stack.push(divideFirst/divideSecond);
            }
            else{
                              

                int num=Integer.valueOf(tokens[i]);
                stack.push(num);}
           
            }
            
        
        return stack.pop();
    }
}