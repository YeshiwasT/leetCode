import java.util.Stack;

public class Daily_Temperatures {
 
    public int[] dailyTemperatures(int[] temperatures) {
        int[] arry=new int[temperatures.length];
           
            Stack<Integer> s=new Stack<Integer>();
            for(int i=temperatures.length-1;i>=0;i--){
                while(!s.empty()&&temperatures[s.peek()]<=temperatures[i]){
                    s.pop();
                }
                arry[i]=s.empty()?0:s.peek()-i;
                s.push(i);
                
            }
           
            
            
            
            return arry;
            
        
    }
}