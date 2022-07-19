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
class Solution {
    public ListNode middleNode(ListNode head) {
      //   int i=1;
      //   ListNode temp=head;
      //   while(head.next!=null){
      //       i++;
      //      head= head.next;
      //   }
      //   int j=0;
      //   while(j<(i/2)){
      //       temp=temp.next;
      //       j++;
      //   }
      // return temp;
        // using two pointer
    ListNode slow=head;
    ListNode fast=head;
        while(fast!=null&&fast.next!=null){
           
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
}