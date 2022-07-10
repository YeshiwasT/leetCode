class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack=new Stack<>();
        int[] ans=new int[temperatures.length];
        for(int i=temperatures.length-1;i>=0;i--){
                int temp=0;
                while(!stack.isEmpty()&&temperatures[i]>=temperatures[stack.peek()]){
                   stack.pop();
                
                    
                }
           //f()
                ans[i]=stack.isEmpty()?0:stack.peek()-i;
                        stack.push(i);

                temp=0;
            
        }
        return ans;
    }
}