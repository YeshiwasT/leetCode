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
            int ans=0;
            int leftVal=0;
    public TreeNode convertBST(TreeNode root) {
       int total= totalSum(root);
        
            return changed(root,total);
    }
    public int totalSum(TreeNode root){
          if(root==null){
              return ans;
          }
//          if(root!=null){
//              ans=ans+root.val;
//              return ans;
//          }
     //   System.out.println(root.val+ans+"  "+root.val);
                     ans=ans+root.val;
         totalSum(root.left);

                     

        totalSum(root.right);

        return ans;
    }
    public TreeNode changed(TreeNode root,int total){
        if(root==null)return null;
                    //  total=total-root.val;

      root.left=changed(root.left,total);
        int temp=root.val;
                           root.val=(total)-leftVal;

                        leftVal+=temp;

                System.out.println(root.val+" "+total+" "+leftVal);
                   //root.val=total-leftVal;
      root.right=changed(root.right,total);
        return root;
        
    }
}