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

public class Search_in_a_Binary_Search_Tree {
 

    public TreeNode searchBST(TreeNode root, int val) {
                if(root.val==val){
                    return root;
                }
                  while(root!=null){
                      if(root.val==val){
                          return root;
                      }
                      if(val>root.val){
                          root=root.right;
                      }else{
                          root=root.left;
                      }
                  }
        return null;
    }
}