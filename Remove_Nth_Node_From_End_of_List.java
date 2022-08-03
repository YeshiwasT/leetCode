// public class Remove_Nth_Node_From_End_of_List {
    

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

//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         ListNode prv=null;
//             ListNode temp=head;
//         //for reversing node
//         while(temp!=null){
//             ListNode next=temp.next;
//             temp.next=prv;

//             prv=temp;

//             temp=next;
           
//         }
        
//         int i=1;
//         ListNode current=prv;
//         ListNode slow=prv;
//         ListNode current2=null;
//         while(i<n&&current.next!=null){
//             slow=current;
//                        current=current.next;
 
//         current2=current.next;
   
//             i++;
            
//         }
//         if(n==1){
//             prv=prv.next;
            
//         }else{
//         slow.next=current2;
//         current.next=null;}
//          ListNode prvious=null;
//             ListNode temporaryy=prv;
//          while(temporaryy!=null){
//             ListNode next=temporaryy.next;
//             temporaryy.next=prvious;
//             prvious=temporaryy;
//             temporaryy=next;
           
//         }
        
        
//        return prvious; 
//     }
// }