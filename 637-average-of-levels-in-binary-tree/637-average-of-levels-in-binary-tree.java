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
                  //  Queue<TreeNode> ans=new LinkedList<TreeNode>();
            int size=q.size();
            int n=size;
                         System.out.println(n);  

           
           // int len=ans.size();
           double result=0.0;
            int i=0;
            while(i<size){
                TreeNode currentNode=  q.poll();
               
             result=result+currentNode.val;
                if(currentNode.right!=null&&currentNode.left==null){
                    q.add(currentNode.right);
                }
                 if(currentNode.left!=null&&currentNode.right==null){
                    q.add(currentNode.left);
                 }
                if(currentNode.right!=null&&currentNode.left!=null){
               q.add(currentNode.right);
              q.add(currentNode.left);}
                i++;
            }
            list.add(result/n);
            
            
        }

        return list;
        
    }
   
}