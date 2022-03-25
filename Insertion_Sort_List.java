public class Insertion_Sort_List {
    

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

    public ListNode insertionSortList(ListNode head) {
       
      
        
        for(ListNode temp=head.next;temp!=null;temp=temp.next){
          ListNode  current=head;
           while(current!=temp){
               if(temp.val<current.val){
                 int value=temp.val;
                   temp.val=current.val;
                   current.val=value;
                   
               }
               current=current.next;
           }
        }
        return head;
    }
}