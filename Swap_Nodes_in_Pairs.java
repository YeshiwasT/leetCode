// public class Swap_Nodes_in_Pairs {

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

//     public ListNode swapPairs(ListNode head) {
    
//         ListNode current=null;
//        ListNode prv=new ListNode(0);
//         ListNode no2=prv;
//               prv.next=head;

//         for(ListNode temp=head;temp!=null;temp=temp.next){
//             if(temp.next!=null){
//                ListNode fast=temp.next.next;
//                ListNode slow=temp.next;
               
//                 temp.next=fast;
//                 prv.next=slow;
//                 slow.next=temp;
                
                   
//             }
//             prv=temp;
//         }
//      return no2.next;   
//     }
// }