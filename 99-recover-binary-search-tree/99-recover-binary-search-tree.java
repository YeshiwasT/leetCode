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
   
     ArrayList<TreeNode> list=new ArrayList<>();
    public void recoverTree(TreeNode root) {
        helper(root);
        for(int i=0;i<list.size();i++){
            int min=i;
            for(int j=i+1;j<list.size();j++){
                
               if(list.get(j).val<list.get(i).val){
                   min=j; } 
            }
              if(list.get(min).val<list.get(i).val){
                   int temp=list.get(min).val;
                   list.get(min).val=list.get(i).val;
                   list.get(i).val=temp;
                   break;
               }  }
    }
    public void helper(TreeNode root){
        if(root==null)return ;
        helper(root.left);
        list.add(root);
        helper(root.right);
    }
}