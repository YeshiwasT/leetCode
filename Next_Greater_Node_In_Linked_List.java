// public class Next_Greater_Node_In_Linked_List {

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

//     public int[] nextLargerNodes(ListNode head) {
//         ListNode current=head;
//         int length=0;
//         while(head!=null){
//             length++;
//             head=head.next;
//         }
//         int[] nodes=new int[length];
//         int i=0;
        
//           while(current!=null){
//                    ListNode temp=current.next;
   
//         while(temp!=null){
            
//             if(current.val<temp.val){
            
//                 nodes[i]=temp.val;
//                 break;
//             }
//             else{
//               nodes[i]=0;  
//             }
//             temp=temp.next;
            
        
//        }
//               i++;
//         current=current.next;
              
//     }
//                       return nodes;
//     }
// }