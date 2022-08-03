// public class Remove_Duplicates_from_Sorted_List {
    

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

//     public ListNode deleteDuplicates(ListNode head) {
//         ListNode temp=head;
//         ListNode current=head;
//         if(head==null){
//             return null;
//         }
        
//           while(temp!=null){
//               if(current.val==temp.val){
//                      if(temp.next==null){
//                          current.next=null;
//                      } 
//                   temp=temp.next;
                 

//               }else{
//               current.next=temp;
//                   current=current.next;
//                                               temp=temp.next;

//               }

//           }
//         return head;
        
//     }
// }