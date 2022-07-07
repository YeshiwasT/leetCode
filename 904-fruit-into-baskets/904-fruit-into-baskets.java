class Solution {
    public int totalFruit(int[] fruits) {
          int firstNumber=0;
        int secondNumber=0;
        int result=1;
        
         Deque<Integer> deque=new LinkedList<>();
        deque.add(0);
        for(int i=1;i<fruits.length;i++){
            if(deque.size()==2&&fruits[i]!=fruits[deque.peekFirst()]&&fruits[i]!=fruits[deque.peekLast()]){
                if(deque.peekFirst()<=deque.peekLast()){
                    
                 firstNumber=deque.peekFirst()+1;
                    System.out.println(firstNumber);
                     deque.pollFirst();}
                else{
                    firstNumber=deque.peekLast()+1;
                        deque.pollLast();
                }
                deque.add(i);
                
            }else
            {if(!deque.isEmpty()){
                if(fruits[i]==fruits[deque.peekFirst()]){
            deque.pollFirst();}
                else if(fruits[i]==fruits[deque.peekLast()]){
            deque.pollLast();}
                deque.add(i);

            }}
            result=Math.max(result,i-firstNumber+1);

        }
    return   result;
    }
}
/* 
1,2,3,2,3
    ^
^
  ^
2,2,3,2,2,3,4,3,3,5
                  
                  ^
          ^
            ^


*/