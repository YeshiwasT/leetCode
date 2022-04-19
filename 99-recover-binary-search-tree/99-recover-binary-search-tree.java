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
             System.out.print(list.get(i).val);
         }
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
               } 
        }
        System.out.println();
         for(int i=0;i<list.size();i++){
             System.out.print(list.get(i).val);
         }
        
    }
    public void helper(TreeNode root){
        if(root==null)return ;
        helper(root.left);
        list.add(root);
        helper(root.right);
    }
    
//          if(root==null)return ;
//         int current=root.val;
//         minRoot(root.left,current);
//         maxRoot(root.right,current);

//          if(current<tempMin){
//             root.val=tempMin;}
//     else if(current>tempMax){
        
//         root.val=tempMax;
    
//     }
//             recoverTree(root.left);
//             recoverTree(root.left);

//     }
   
//     public void minRoot(TreeNode root,int current){
//         if(root==null)return ;
    
//         if(current<root.val)
//        {    
//            tempMin=root.val;
//            root.val=current;
//           // return tempMin;
//           // return ;
//        }
//     minRoot(root.left,current);
//     minRoot(root.right,current);
//    // return   tempMin;
        
//     }
//      public void maxRoot(TreeNode root,int current){
//          if(root==null)return ;
         
//           if(current>root.val){
//              tempMax=root.val;
//            root.val=current;
//            //   return;
              
//           // return tempMax;
//         }
//            maxRoot(root.left,current);
//      maxRoot(root.right,current);
//        // return tempMax;
  //  }
}