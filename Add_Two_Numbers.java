/**
 * Add_Two_Numbers
 * 
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 
*/
public class Add_Two_Numbers {
    //listNode class
     public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }
        

    int carry=0;
    ListNode l3;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       
        sumNode(l1,l2);

        
        if(carry!=0){
        l3=insert(l3,carry);       
        }
        
      return  l3;
       
 
    }
    public ListNode sumNode(ListNode l1,ListNode l2){        

        if(l1==null&&l2==null){
            return null;
        }
        else if(l1==null&&l2!=null){
          l2.val=l2.val+carry;
            carry=0;
            l3=insert(l3,aboveTen(l2.val));
                     sumNode(null,l2.next);

            return l2;

        }
        else if(l1!=null&&l2==null){

l1.val=l1.val+carry;
            carry=0;
            l3=insert(l3,aboveTen(l1.val));
                     sumNode(l1.next,null);

            return l1;
        }
          int head=l1.val+l2.val+carry;
        carry=0;
       int l3Value= aboveTen(head);
            System.out.println();

          l3=insert(l3,l3Value);

         sumNode(l1.next,l2.next);

           return l3   ;
    
        
    }
    public int aboveTen(int greater){
           if(greater>=10){
           int sub=greater-10;
            carry+=1;
                      
               return  sub;
    }
   
    else{
        return greater;
    }}
    
    public ListNode insert(ListNode root, int item)
{
    ListNode ptr, temp;
    temp = new ListNode();
    temp.val = item;
    temp.next = null;
 
    if (root == null)
        root = temp;
    else {
        ptr = root;
        while (ptr.next != null)
            ptr = ptr.next;
 
        ptr.next = temp;
    }
    return root;
}

}