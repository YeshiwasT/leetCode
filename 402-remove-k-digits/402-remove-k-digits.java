class Solution {
    public String removeKdigits(String num, int k) {
        int len=num.length();
        int ff=k;
        if(num.length()==k){
            return "0";
        }
        Stack<Character> stack=new Stack<>();
        StringBuilder MyString = new StringBuilder();
        int z=0;
       for(int i=0;i<num.length();i++){

       while(k>0&&!stack.isEmpty()&&stack.peek()>num.charAt(i)){
           stack.pop();
           k--;
           z++;
       }
           stack.push(num.charAt(i));
       
       }
        if(len==stack.size()){
           while(z<k&&!stack.isEmpty()){
               stack.pop();
               z++;
           } 
        }
        while(z<ff&&!stack.isEmpty()){
            System.out.println('j');
               stack.pop();
               z++;
           } 
        while(!stack.isEmpty()){
            MyString.append(stack.pop()); 
            
        }
        MyString.reverse();
        while(MyString.length()>1&&MyString.charAt(0)=='0'){
            MyString.deleteCharAt(0);
        }
        return MyString.toString();
    }
}