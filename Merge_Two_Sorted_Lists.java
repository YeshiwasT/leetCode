// public class Merge_Two_Sorted_Lists {
    

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

//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//         if(list1==null&&list2==null){
//             return null;
//         }
//         ListNode current=new ListNode(0);
//         ListNode temp=current;
//         while(list1!=null&&list2!=null){
//             if(list1.val<list2.val){
//                 current.next=list1;
//                 list1=list1.next;
//             }else{
//                 current.next=list2;
//                 list2=list2.next;
//             }
//             current=current.next;
//         }
//         while(list1!=null){
//             current.next=list1;
//             list1=list1.next;
            
//             current=current.next;
//         }
//         while(list2!=null){
            
//             current.next=list2;
//             list2=list2.next;
//             current=current.next;
//         }
//         return temp.next;
//     }
// }