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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSubPath(ListNode head, TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        ListNode current=head;
        while(!queue.isEmpty()){
            int n=queue.size();
            while(n-->0){
                TreeNode temp=queue.poll();
                if(temp.val==current.val){
                      if (helper(current.next, temp.left) || helper(current.next, temp.right)) {
                    return true;
                }
                }
                
                if(temp.right!=null)
                    queue.add(temp.right);
                if(temp.left!=null)
                    queue.add(temp.left);
            }}
           return false; 
        }
        
    
     boolean helper(ListNode head, TreeNode root) { 
        if (head == null) { 
            return true;
        }
        if (root == null) {  
            return false;
        }
        if (head.val == root.val) {
            return helper(head.next, root.left) || helper(head.next, root.right);
        } else {
            return false;
        }
    }

}