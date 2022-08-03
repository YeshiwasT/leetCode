// import java.util.HashMap;


// public class Remove_Duplicates_from_Sorted_List_II {
 
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
//         ListNode prv=new ListNode(0);
//                 ListNode ans=prv;

//         if(head==null){
//             return null;
//         }
//         ListNode temp=head;
//         ListNode current=head.next;
//         HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
//        while(current!=null){
//            if(current.val==temp.val){
             
//                map.put(temp.val,1);
//                 current=current.next;
//                temp=temp.next;
//            }
//            else{
//                current=current.next;
//                temp=temp.next;
//            }
           
//        }
        
//         ListNode nexted=head;
//         while(nexted!=null){
//            if(map.containsKey(nexted.val)){

//                               nexted=nexted.next;
//            }else{
//             ListNode reserv=nexted;
//             prv.next=reserv;        
//             prv=reserv;
//             nexted=nexted.next;
//             reserv.next= null;
//         }}
       
        
//         return ans.next;
        
//     }
// }