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
    List<TreeNode> list=new LinkedList<>();
    public void flatten(TreeNode root) {
        if(root==null)return;
        addList(root);
        TreeNode temp=root;
        for(int i=1;i<list.size();i++){
           build(temp,i);
            temp=temp.right;
 
        }
             //   System.out.print(root.left.val);

            }
    public void build(TreeNode root,int i){
        
        root.left=null;
        root.right=list.get(i);
    }
    public void addList(TreeNode root){
        if(root==null)return;
        
        list.add(root);
        addList(root.left);
        addList(root.right);
    }
}