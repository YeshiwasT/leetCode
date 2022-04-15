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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list=new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            int n=size;
            double result=0.0;
            while(size-- > 0){
                TreeNode currentNode=  q.poll();
             result += currentNode.val;
                if(currentNode.right!=null){
                    q.add(currentNode.right); }
                 if(currentNode.left!=null){
                    q.add(currentNode.left);
                 }
            }
            list.add(result/n);   
        }
 return list;
        
    }
   
}