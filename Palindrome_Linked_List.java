// public class Palindrome_Linked_List {
    

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

//     public boolean isPalindrome(ListNode head) {
//         boolean isPalindrome=true;
//      int i=0;
//         int j=1;
//         ListNode temp=head;
//   ArrayList<Integer>  list=new ArrayList<Integer>();
//         while(temp!=null){
//           list.add(temp.val);
//             temp=temp.next;
//         }
//         while(j<list.size()){
//             if(list.get(j)!=list.get(list.size()-1-j)){
//                 isPalindrome=false;
//             }
//             j++;
//         }
        
//         return isPalindrome;
        
//     }
// }