import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Basic_Calculator_II {
 
    public int calculate(String s) {
      s=s.replace(" ","");
        Stack<String> sString=new Stack<String>();
        
        List<String> slist=new ArrayList<String>();
        
        String cs="";
        ArrayList<String> alist=new ArrayList<String>();
        for(int k=0;k<s.length();k++){
            if(s.charAt(k)=='+'){
                alist.add(cs);
                alist.add("+");
                cs="";
            }
           else if(s.charAt(k)=='-'){
                alist.add(cs);
                alist.add("-");
                cs="";
            }
          else  if(s.charAt(k)=='/'){
               alist.add(cs);
                alist.add("/");
                cs="";
            }
          else  if(s.charAt(k)=='*'){
               alist.add(cs);
                alist.add("*");
                cs="";
            }
            else{
            cs=cs+s.charAt(k);
                
            }
        }
        if(!cs.equals("")){
            alist.add(cs);
        }
    
        String[] strdoub = new String[alist.size()];
 
        for (int i = 0; i < alist.size(); i++) {
            strdoub[i] = alist.get(i);
        }
        System.out.println(Arrays.toString(strdoub));
        for(int i=0;i<strdoub.length;i++){
           if(strdoub[i].equals("-")){
               
               if(sString.isEmpty()){ 
                   
                sString.push("-");}
               else{
                   while(!sString.isEmpty()&&sString.peek().equals("-")||!sString.isEmpty()&&sString.peek().equals("*")||!sString.isEmpty()&&sString.peek().equals("/")){
                       slist.add(sString.pop());
                   }
                  sString.push("-"); 
               }
            }
            else  if(strdoub[i].equals("+")){
                
              if(sString.isEmpty()) {                                             
                sString.push("+");}
               else{
                      while(!sString.isEmpty()&&sString.peek().equals("-")||!sString.isEmpty()&&sString.peek().equals("*")||!sString.isEmpty()&&sString.peek().equals("/")){
                       slist.add(sString.pop());
                   }
                  sString.push("+"); 
               }
            }
           else   if(strdoub[i].equals("/")){
            if(!sString.isEmpty()&&sString.peek().equals("/")||!sString.isEmpty()&&sString.peek().equals("*")){
                slist.add(sString.pop());
                sString.push("/");}else{
                sString.push("/");
            }}
              
            
            else if(strdoub[i].equals("*")){
              
               if(sString.isEmpty()||sString.peek().equals("+")||sString.peek().equals("-")) {                                             
                sString.push("*");}
               else{
                   while(!sString.isEmpty()&&sString.peek().equals("*")||!sString.isEmpty()&&sString.peek().equals("/")){
                       slist.add(sString.pop());
                   }
                  sString.push("*"); 
               }
                
            }
            else{
                
                
                                     slist.add(strdoub[i]);
   
                }
           
            } 
       
        while(!sString.isEmpty()){
            slist.add(sString.pop());
        }
        String[] stringArray = slist.toArray(new String[0]);
            System.out.println(Arrays.toString(stringArray));   

        
        return evalRPN(stringArray);
    }
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