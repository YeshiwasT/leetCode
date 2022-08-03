import java.util.Stack;

public class Baseball_Game{
    
        public int calPoints(String[] ops) {
            Stack<String> stack=new Stack<>();
            if (ops.length==1){
                return Integer.parseInt(ops[0]);
            }
            for(int i=0;i<ops.length;i++){
                if(!stack.isEmpty()&&ops[i].equals("C")){
                    stack.pop();
                }else if(!stack.isEmpty()&&ops[i].equals("D")){
                   
                    stack.push(Integer.toString(2*Integer.parseInt(stack.peek())));
                }
           else if(stack.size()>=2&&ops[i].equals("+")){
                 String temp1=   stack.pop();
                            String temp2=   stack.peek();
               stack.push(temp1); 
               stack.push(Integer.toString(Integer.parseInt(temp1)+Integer.parseInt(temp2)));
         
               
                }else {
               try {
     
                   stack.push(Integer.toString(Integer.parseInt(ops[i])));
    
    } catch (NumberFormatException e) {
                   continue;
      
    }
           }}
           int result=0;
                          while(!stack.isEmpty()){
                         
                              result=result+Integer.parseInt(stack.pop());
                          }
            return result;
        }
    }
