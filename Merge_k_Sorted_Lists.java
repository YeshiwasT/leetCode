import java.util.PriorityQueue;

public class Merge_k_Sorted_Lists {
    

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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        if(lists.length==0){
            return null;
        }
        for(int i=0;i<lists.length;i++){
          ListNode current=lists[i];
            while(current!=null){
                pq.add(current.val);
               current= current.next;
            }
        }
        ListNode head=new ListNode(0);
        ListNode temp=head;
        while(pq.size()>0){
          temp.next=new ListNode(pq.poll());
          temp=temp.next;    
        }
        return head.next;
    }
}