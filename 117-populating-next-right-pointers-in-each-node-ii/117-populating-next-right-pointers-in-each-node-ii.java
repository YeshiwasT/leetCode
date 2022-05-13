/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null)return null;
        Node result=new Node(root.val);
        Queue<Node> queue=new LinkedList<>();
              //  helper(root);

        queue.add(root);
        while(!queue.isEmpty()){
        // Node temp=new Node(root.val);   
          //  if(queue.peek()!=null){
         int len=queue.size();
            for(int i=0;i<len;i++){
                         Node temp= queue.poll();
                if(i<len-1){
                  temp.next=queue.peek();
   
                }

          if (temp.left != null) {
                queue.add(temp.left);
            }
 
            if (temp.right != null) {
                queue.add(temp.right);
            }
            }
           
           
          //  queue.add(null);
        }
        
        return root;
        
    }
//     public void helper(Node root){
//          if(root==null)return;
//         helper(root.left);
//         helper(root.right);
//                 System.out.print(root.val+"k");
//                 root.next=null;


//     }
}