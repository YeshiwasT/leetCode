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
    public ListNode rotateRight(ListNode head, int k) {
                    if(head==null)return null;
        ListNode current=head;
        int size=0;
        while(current!=null){
            
            size++;
            current=current.next;
        }
        while(k%size>0){
          ListNode temp=head;
            ListNode slow=null;
             ListNode fast=null;

            while(temp.next!=null) {
               slow=temp; 
                fast=temp.next;
                temp=temp.next;
            }
            if(slow!=null){
            slow.next=null;
            fast.next=head;
            head=fast;}
            k--;
        }
        return head;
    }
}