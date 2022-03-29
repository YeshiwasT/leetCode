import java.util.ArrayDeque;
import java.util.Deque;

public class Design_Circular_Deque {
  
    int length =0;
          Deque<Integer> deque=new ArrayDeque<Integer>();
  
      public Design_Circular_Deque(int k) {
          length=k;
      }
      
      public boolean insertFront(int value) {
          if(deque.size()==length){
              return false;
          }
         return deque.offerFirst(value);
          
      }
      
      public boolean insertLast(int value) {
          if(deque.size()==length){
              return false;
          }
         return deque.offerLast(value);
      }
      
      public boolean deleteFront() {
          if(deque.pollFirst()==null){
              return false;
          }else{
             return true; 
          }
          
      }
      
      public boolean deleteLast() {
            if(deque.pollLast()==null){
              return false;
          }else{
             return true; 
          }
          
      }
      
      public int getFront() {
           if(deque.size()==0){
              return -1;
          }else
          return deque.peekFirst();
      }
      
      public int getRear() {
           if(deque.size()==0){
              return -1;
          }else{
            
         return deque.peekLast(); 
      }}
      
      public boolean isEmpty() {
          if(deque.size()==0){
              return true;
          }
          else {
              return false;
          }
      }
      
      public boolean isFull() {
            if(deque.size()==length){
              return true;
          }
          else {
              return false;
          }
      }
  }
  
  /**
   * Your MyCircularDeque object will be instantiated and called as such:
   * MyCircularDeque obj = new MyCircularDeque(k);
   * boolean param_1 = obj.insertFront(value);
   * boolean param_2 = obj.insertLast(value);
   * boolean param_3 = obj.deleteFront();
   * boolean param_4 = obj.deleteLast();
   * int param_5 = obj.getFront();
   * int param_6 = obj.getRear();
   * boolean param_7 = obj.isEmpty();
   * boolean param_8 = obj.isFull();
   */