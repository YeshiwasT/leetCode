class Solution {
    class TwoSet{
        char character;
        int num;
        TwoSet(char x,int y){
            character=x;
            num=y;
        }
    }
    public String removeDuplicates(String s, int k) {
        Stack<TwoSet> stack=new Stack<>();
       
        for(int i=0;i<s.length();i++){
            if(!stack.isEmpty()&&stack.peek().character==s.charAt(i)&&stack.peek().num<k){
                
                stack.peek().num=stack.peek().num+1;
                if(stack.peek().num==k){
                    stack.pop();}
            }
          else{
                TwoSet sets=new TwoSet(s.charAt(i),1);
                stack.push(sets);
                }
            }
        String str="";
        while(!stack.isEmpty()){
            String total="";
            if(stack.peek().num>1){
                int j=0;
                String dob="";
                while(j<stack.peek().num){
                       dob+=stack.peek().character; 
                    
                    j++;
                }
                total=dob;
                stack.pop();
            }else{
                total=Character.toString(stack.pop().character);
            }
            str=total+str;
        }
        
        return str;
    }
}