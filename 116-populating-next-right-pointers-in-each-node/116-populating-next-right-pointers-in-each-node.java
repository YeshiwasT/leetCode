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
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int n=queue.size();
            while(n-->0){
               Node temp=queue.poll();
                if(n==0){
                    temp.next=null;
                }
                else{
               temp.next=queue.peek();
               }
                if(temp.left!=null)
                    queue.add(temp.left);
                  
                if(temp.right!=null)
                    queue.add(temp.right);
                    
                 }
        }
        return root;
        
        
    }
}