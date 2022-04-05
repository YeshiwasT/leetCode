/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Reorder_List {
    



    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
         ListNode temp=null;
        if(head.next==null){
            return ;
        }else{
        
        while(fast!=null&&fast.next!=null){
             temp=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
            temp.next=null;
            
    }
       
        int count=0;
        ListNode prv=null;
        ListNode secondHead=slow;
        while(secondHead!=null){
            count++;
            ListNode current=secondHead.next;
            secondHead.next=prv;
            prv=secondHead;
            
            secondHead=current;
        }
  
        ListNode curPrv=null;
        ListNode firstHead=head;
        ListNode follow=null;
        ListNode current=null;
        int count2=0;
        while(prv!=null){
        follow=prv;
            if(firstHead!=null){
                count2++;
                follow=current;
             
            current=firstHead.next;
   
             curPrv=prv.next;
            firstHead.next=prv;
            prv.next=current;
            firstHead=current;
            prv=curPrv;}else{
               
            prv=prv.next;}
                                            


        }
        temp=head;
        
        if(count!=count2){
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=follow;}
      
    }
}