class Node{
public int  val;
public Node next;
    public Node(int val){
       this(val,null);
    }
    public Node(int val,Node next){
       this.val=val;
        this.next=next;
    }
}

class MyLinkedList {
       public Node head;
        public Node tail;
    public MyLinkedList() {
        head=tail=null;
    }
    public boolean isEmpty(){
        if(head==null&&tail==null){
            return true;
        }
        else{
            return false;
        }
    }
    public int size(){
        Node temp=head;
        if(isEmpty()){
            return 0;
        }
        else{
          int  i=1;
            while(temp.next!=null){
                temp=temp.next;
                 i++;   
            }
            return i;
        }
    }
    
    public int get(int index) {
        int i=0;
        Node temp=head;
        while(i<index&&temp!=null){
            temp=temp.next;
            i++;

        }if(temp!=null){
           
        return temp.val;}
        else{
        return -1;}
        
    }
    
    public void addAtHead(int val) {
      head=new Node(val,head);
       if(tail==null){
           tail=head;
       }
        
    }
      public void addAtTail(int val) {
        if(size() == 0) {
            addAtHead(val);
            return;
        }
            Node temp=head;
           while(temp.next!=null){
               temp=temp.next;
           }
     Node   current=new Node(val);
        temp.next=current;
        current.next=null;
}
    
    public void addAtIndex(int index, int val) {
            if(index==0){
               addAtHead(val); 
            }else  {
            int i=0;
            Node temp=head;
            if(temp!=null&&index<=size()){
               if(index==size()){
                   addAtTail(val);
               }else{
            while(i<index-1&&temp.next!=null){
               temp=temp.next; 
                i++;
            }

            Node nexted=temp.next;
             if(nexted!=null){
                        System.out.println(nexted.val);
             }
            Node toBeAdded=new Node(val);
            temp.next=toBeAdded;
                
            toBeAdded.next=nexted;
                
            }
            }}
        
    }
    
    public void deleteAtIndex(int index) {
        Node temp=head;
        if(index==0){
           head=head.next; 
        }
        else if(index>size()){
            return;
        }else{
            int i=0;
            while(i<index-1&&temp.next!=null){
               temp=temp.next; 
                i++;
            }
            if(temp.next!=null){
                 Node nexted=temp.next.next;
            temp.next=nexted;  
            }
         
            
        }
      
            }
          
    
    
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */