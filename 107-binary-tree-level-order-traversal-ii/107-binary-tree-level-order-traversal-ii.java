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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        List<List<Integer>> list=new LinkedList<>();
                if(root==null)return list;

        queue.add(root);
        while(!queue.isEmpty()){
            int n=queue.size();
            List<Integer> li=new LinkedList<>();
            while(n-->0){
                TreeNode temp=queue.poll();
                li.add(temp.val);
                if(temp.left!=null)
                    queue.add(temp.left);
                if(temp.right!=null)
                    queue.add(temp.right);
            }
            list.add(li);
        }
        Collections.reverse(list);
        return list;
    }
}