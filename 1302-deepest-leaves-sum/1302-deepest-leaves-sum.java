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
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
       // ArrayList<Integer> list=new ArrayList<>();
        queue.add(root);
        int ans=0;
        int res=0;
        while(!queue.isEmpty()){
           int n =queue.size();
           while(n-- >0){
               TreeNode temp=queue.poll();
               ans=ans+temp.val;  
               if(temp.right!=null){
                 queue.add(temp.right);
                }
               if(temp.left!=null){
                 queue.add(temp.left);
                 } }
           res=ans;
           ans=0;}
        return res;
    }
   
}