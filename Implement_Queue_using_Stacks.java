import java.util.Stack;

public class Implement_Queue_using_Stacks {
    

    static Stack<Integer> s1=new Stack<Integer>();
        static Stack<Integer> s2 =new Stack<Integer>();
        public Implement_Queue_using_Stacks() {
            
        }
        
        public static void push(int x) {
           if(!s2.isEmpty()){
               while(!s2.isEmpty()){
                   s1.push(s2.pop());
               }
           }else{
                s1.push(x);
           }
            
            
        }
        
        public static int pop() {
            while (!s1.empty()) {
                s2.push(s1.pop());
            }
            return s2.pop();
            
        }
        
        public static int peek() {
            while (!s1.empty()) {
                s2.push(s1.pop());
            }
            return s2.peek();
            
        }
        
        public static boolean empty() {
           
            return s2.empty()&&s1.isEmpty();
            
        }
    
    
    /**
     * Your MyQueue object will be instantiated and called as such:
     * MyQueue obj = new MyQueue();
     * obj.push(x);
     * int param_2 = obj.pop();
     * int param_3 = obj.peek();
     * boolean param_4 = obj.empty();
     */
    public static void main(String[] args) {
        Implement_Queue_using_Stacks.push(3);
        Implement_Queue_using_Stacks.push(4);
        Implement_Queue_using_Stacks.push(5);
        Implement_Queue_using_Stacks.push(6);
        // while (!s1.empty()) {
        //     System.out.println(s1.pop());
        // }
       
            System.out.println(Implement_Queue_using_Stacks.peek());
            System.out.println(Implement_Queue_using_Stacks.pop());
            System.out.println(Implement_Queue_using_Stacks.pop());

            System.out.println(Implement_Queue_using_Stacks.pop());
            System.out.println(Implement_Queue_using_Stacks.pop());

            System.out.println(Implement_Queue_using_Stacks.empty());

        


    }}