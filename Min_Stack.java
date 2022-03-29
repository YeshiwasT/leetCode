import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class Min_Stack {
 
    Stack<Integer> stack=new Stack<Integer>();
    HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
    List<Integer> list=new ArrayList<>();
    public Min_Stack() {
        
    }
    
    public void push(int val) {
      stack.push(val);
        list.add(val);
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            map.put(i,list.get(i));
        }
        
    }
    
    public void pop() {
       int poped=stack.pop();
        list.remove(new Integer(poped));
         Collections.sort(list);
        for(int i=0;i<list.size();i++){
            map.put(i,list.get(i));
        }
        
    }
    
    public int top() {
    return stack.peek();    
    }
    
    public int getMin() {
        
       return map.get(0); 
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */