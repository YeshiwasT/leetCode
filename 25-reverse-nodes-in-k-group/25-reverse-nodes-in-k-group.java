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
    public ListNode reverseKGroup(ListNode head, int k) {
       
        Stack<ListNode> stack=new Stack<>();
        ListNode prv=new ListNode(-1,head);
        ListNode temp=head;        
        ListNode next=prv;

        while(temp!=null){
            if(stack.size()==k){
                while(!stack.isEmpty()){

                    prv.next=stack.pop();
                    prv=prv.next;
   
                }
                prv.next=null;
               prv.next=temp;
            }
             ListNode current=temp;
            stack.push(current);      
            temp=temp.next;

        }
        if(stack.size()==k){
              while(!stack.isEmpty()){

                    prv.next=stack.pop();
                    prv=prv.next;
   
                }
            prv.next=null;
        }
        return next.next;
    }
}