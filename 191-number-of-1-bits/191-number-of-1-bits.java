public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count=0;
          while(n!=0){
              n=n&(n-1);
             // n >>>1;
                     count++;

              System.out.println(n);
          }
    
       // count++;
    
    return count;
      //  return count;
    }
}