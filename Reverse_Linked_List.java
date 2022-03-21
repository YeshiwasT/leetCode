public class Reverse_Linked_List {

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

    public ListNode reverseList(ListNode head) {
       
        ListNode prevous=null;
        ListNode nextTemp=null;
         
        while(head!=null){
           nextTemp=head.next;
          head.next=prevous; 
                        prevous=head;

        head=nextTemp;
            
            
        }
        return prevous;
    }
    
}