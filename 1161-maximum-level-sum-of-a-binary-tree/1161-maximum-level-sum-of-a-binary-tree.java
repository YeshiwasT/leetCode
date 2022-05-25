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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int max=0;
        int res=Integer.MIN_VALUE;
        int i=1;
        int ans=0;
        while(!queue.isEmpty()){
            int n=queue.size();
            while(n-->0){
                TreeNode temp=queue.poll();
                max+=temp.val;
                if(temp.left!=null){
                    queue.add(temp.left);
                }
                if(temp.right!=null){
                    queue.add(temp.right);
                }}
                if(res<max){
                    res=max;
                   ans=i; 
                }
                max=0;
                i++;
            
        }
        return ans;
    }
}