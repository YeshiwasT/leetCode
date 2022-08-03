public class KnapSnak {


    static int max(int a, int b)
    {
      return (a > b) ? a : b;
    }
 
    static int knapSack(int W, int wt[], int val[], int n)
    {
        // Base Case
        if (n == 0 || W == 0)
            return 0;
 
        if (wt[n - 1] > W)
            return knapSack(W, wt, val, n - 1);
 
        else 
            return max(val[n - 1]+ knapSack(W - wt[n - 1], wt , val, n - 1),knapSack(W, wt, val, n - 1));
    }
    
    public static void main(String[] args) {
        int val[] = new int[] { 60, 100, 120, 200 };
        int wt[] = new int[] { 4 ,10, 30, 40 };
        int W = 15;
        int n = val.length;
        System.out.println(knapSack(W, wt, val, n));
    }
    
}
    

