// public class Maximum_Twin_Sum_of_a_Linked_List {

// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */

//     public int pairSum(ListNode head) {
//         int maxnum=0;

//         if(head.next.next==null){
//             return head.val+head.next.val;
//         }
//         ListNode temp=head;
//         ListNode current=null;
//         ListNode slow=head;
//                 ListNode prv=null;
        
//             ListNode fast=head;
//        while(fast.next.next!=null){
//                        slow=slow.next;
//            current=slow.next;

//            fast=fast.next.next;
//            temp=temp.next;
//        }
     
//         while(current!=null){
//             ListNode next2=current.next;
//             current.next=prv;
            
//             prv=current;
            
//            current=next2; 
//         }
        
//         while(head!=null&&prv!=null){
//                     System.out.println(head.val+" "+prv.val);

//             if(maxnum<head.val+prv.val){
//                 maxnum=head.val+prv.val;
//             }
//             head=head.next;
//             prv=prv.next;
//         }
        
        
        
//         return maxnum;
//     }
// }