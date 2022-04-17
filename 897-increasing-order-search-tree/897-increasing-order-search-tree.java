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
    TreeNode node=new TreeNode(0);
    ArrayList<Integer> list=new ArrayList<>();
    public TreeNode increasingBST(TreeNode root) {
        helper(root);
        int i=0;
        TreeNode current=node;
        while(i<list.size()){
            current.right=new TreeNode(list.get(i));
            current.left=null;
            current=current.right;
            i++;
            
        }
        return node.right;
    }
    public TreeNode helper(TreeNode root){
           if(root==null)return null;  
        helper(root.left);
        list.add(root.val);
       
        helper(root.right);
               
                   

        return root;
    }
}