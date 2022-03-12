
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
public class Middle_of_the_Linked_List {

    
    
    public ListNode middleNode(ListNode head) {
        int i=1;
        ListNode temp=head;
        while(head.next!=null){
            i++;
           head= head.next;
        }
        int j=0;
        while(j<(i/2)){
            temp=temp.next;
            j++;
        }
      return temp;  
    }
}