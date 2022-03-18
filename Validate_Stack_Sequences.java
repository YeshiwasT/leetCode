import java.util.Stack;

public class Validate_Stack_Sequences {
  
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack=new Stack<Integer>();
        boolean isValidSequence=false;
       
        int k=0;
        for(int j=0;j<pushed.length;j++) {
                       
            if(!stack.empty()&&popped[k]==stack.peek()){
                while(k<popped.length&&popped[k]==stack.peek()){
                stack.pop();
                k++;}
            }else{
                stack.push(pushed[j]);
                 while(k<popped.length&&!stack.empty()&&popped[k]==stack.peek()){
                stack.pop();
                k++;}
            }
            
        }
       
        if(stack.empty()){
            isValidSequence=true;
        }
        return isValidSequence;
    }
}