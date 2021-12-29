
 public class Binary_Tree_Tilt {

 // Definition for a binary tree node.
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }
    

    int value=0;
 
  
       public int findTilt(TreeNode root) {
        if(root==null){
       return 0;
   }      
         printPostorder(root);
        
           return addTilt(0);
       }
       public int printPostorder(TreeNode node)
     {
         if (node == null)
             return 0;
        else  if(node.left==null && node.right==null){
              
              return node.val;
          }
           else if (node.left==null && node.right!=null){
  addTilt( Math.abs(printPostorder(node.right)));
 
         node.val=node.val+node.right.val;
               return node.val;
           }
           else if (node.left!=null && node.right==null){
          addTilt(Math.abs(printPostorder(node.left)));
 
                  node.val=node.val+node.left.val;
               return node.val;
           }

         addTilt(Math.abs(printPostorder(node.left)- printPostorder(node.right)));
         node.val=node.val+node.right.val+node.left.val;
         
    return node.val;
       }
 // to add tilt value and store in value variable
     public int addTilt(int tilt ) {
         value=value+tilt;
 
         return value;
     }
   
 
 }
   